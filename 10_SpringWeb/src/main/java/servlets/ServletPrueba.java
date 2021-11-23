package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import objetos.Mensaje;


@WebServlet("/ServletPrueba")
public class ServletPrueba extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private ApplicationContext context;
    //Se inicia una sola vez cuando se crea el servlet
    //recordar que los servlets son sigleton
	@Override
	public void init() throws ServletException {
		context = WebApplicationContextUtils
					.getRequiredWebApplicationContext
					(getServletContext());
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Mensaje mensajeSingleton = 
				context.getBean("mensajeSingleton",Mensaje.class);
		Mensaje mensajePrototype = 
				context.getBean("mensajePrototype",Mensaje.class);
		Mensaje mensajePrototype2 = 
				context.getBean("mensajePrototype",Mensaje.class);
		Mensaje mensajeRequest = 
				context.getBean("mensajeRequest",Mensaje.class);
		Mensaje mensajeRequest2 = 
				context.getBean("mensajeRequest",Mensaje.class);
		Mensaje mensajeSession = 
				context.getBean("mensajeSession",Mensaje.class);
				
		request.setAttribute("mp1", mensajePrototype);
		request.setAttribute("mp2", mensajePrototype2);
		request.setAttribute("mr1", mensajeRequest);
		request.setAttribute("mr2", mensajeRequest2);
		request.setAttribute("msession", mensajeSession);
		request.setAttribute("msingleton", mensajeSingleton);
		
		request.getRequestDispatcher("pagina.jsp").forward(request, response);
	}
}
