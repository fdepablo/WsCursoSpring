package es.curso;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import es.curso.modelo.entidad.Pelicula;
import es.curso.modelo.persistencia.DaoPeliculaJPAData;

@SpringBootApplication
public class Application {

	public static ApplicationContext context = null;
	
	public static void main(String[] args) {
		context = SpringApplication.run(Application.class, args);
		
		Pelicula p = context.getBean("pelicula",Pelicula.class);
		p.setTitulo("La guerra de las galaxias");
		p.setGenero("Scifi");		
		p.setDirector("George Lucas");
		p.setYear(1975);
		p.setFechaAlta(new Date());
		
		//Para este ejemplo mejor usar directamente el Dao y no el Gestor
		DaoPeliculaJPAData gp = context.getBean(DaoPeliculaJPAData.class);
		System.out.println("**** INSERTANDO PELICULA ****");
		p = gp.save(p);
	
		System.out.println("id insertado: " + p.getId());
		
		System.out.println("**** BUSCAR PELICULA ****");
		
		System.out.println(gp.findById(p.getId()));
	}

}
