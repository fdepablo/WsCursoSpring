package es.curso.controlador;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//Para dar de alta un controlador  y que FrontController sepa localizarlo
//usaremos la anotacion @Controller
@Controller
public class ControladorSaludo {
		
	//Mediante la anotacion @RequestMapping (que es propia de MVC) podemos
	//mapear URLs. Por defecto esta anotacion mapea todos los verbos HTTP
	@RequestMapping("verFormularioSaludo")
	public String verFormulario() {
		//al devolver "formularioSaludo" usara el objeto viewResolver para formar
		//la direccion "/WEB-INF/vistas/formularioSaludo.jsp"
		return "formularioSaludo";
	}
		
	//Podemos en la anotacion @RequestMapping restringir el acceso al metodo
	//que queramos poniendo el atributo "method"
	
	//A los metodos anotados con anotaciones de SpringWeb podemos pasarle
	//por parametro muchos tipos de objetos. Entre ellos:
	
	//1. Si anotamos un parametro de entrada con @RequestMapping, Spring
	//buscara un parametro con ese nombre para inyectarlo
	//2. Podemos tambien pasarle el objeto HttpServletRequest para obtener
	//parametos, datos, etc.
	//3. Podemos pasarle un objeto de tipo Model (o ModelAndView) para 
	//almacenar datos que mandaremos a la vista
	
	//Los metodos de Spring MVC pueden devolver String, ModelAndView o View
	//De los más habituales, un String con el nombre de la vista a la que queremos
	//ir
	@RequestMapping(path="saludar",method=RequestMethod.POST)
	public String metodoSaludo(@RequestParam("nombre") String nombre,
			HttpServletRequest request, 
			Model model,
			ModelAndView mav){
		
		String nombrePorParametro = request.getParameter("nombre");
		System.out.println(nombrePorParametro);
		System.out.println(nombre);
		
		//Aqui irian las llamadas a los servicios o gestores
		//....
		
		//De esta manera sería equivalente a devolver un String y meter
		//en el Model los atributos
		//mav.setViewName("saludo");
		//mav.addObject("nombre", nombre);
		//return mav;
		
		//Con el objeto model podemos generar atributos para recoger en las vistas
		model.addAttribute("nombre",nombre);
		return "saludo";
	}
	
	//En vez de usar RequestMapping podemos usar las anotaciones que incluyen
	//ya los verbos HTTP, como puede ser @GetMapping o @PostMapping
	@GetMapping("verRedireccion")
	public String verRedireccion(Model model) {
		
		//Esta vez como vamos a hacer un redirect ira el valor como parametro
		//de la request
		model.addAttribute("valor", "Esto es un valor de prueba");
		
		//Siempre que hagamos un redirect, no usaremos el view resolver de 
		//Spring, si no que mandaremos una peticion 300 a nuestro navegador
		//para que vaya a la URL que le mandemos.
		//Aqui le estamos mandando directamente a un controlador (el de más abajo)
		//en vez de pasar por el viewResolver.
		//Ademas, hay que tener en cuenta que no podemos acceder a la carpeta
		//WEB-INF haciendo un redirect, por lo que en este caso sería obligatorio
		//pasar por un controlador que mediante un view-resolver nos mande 
		//a los JSPs
		return "redirect:redireccion";
	}
	
	//Este metodo entramos cuando salimos del anterior ya que estamos haciendo una redireccion
	@GetMapping("redireccion")
	public String mostrarSaludos(
			@RequestParam("valor") String valor,
			Model model) {

		model.addAttribute("valor", valor);
		return "redireccion";
	}
}
