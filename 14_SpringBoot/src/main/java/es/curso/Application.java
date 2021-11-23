package es.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import es.curso.entidad.Pelicula;

/*
 * @SpringBootApplication engloba 3 anotaciones importantes
 * 
 * 1- @Configuration, decimos que esta clase va a tener Beans
 * para dar de alta en el contexto de Spring, es decir, metodos
 * anotados con @Bean 
 * 
 * 2- @ComponentScan, buscar anotaciones de Spring dentro de la aplicacion
 * de manera automatica, va a buscarlas en las clases de este paquete y en 
 * todos los paquetes hijos
 * 
 * 3- @EnableAutoConfiguration, decimos a Spring que cuando arranque la
 * aplicacion instancie todos los beans que necesite para que funcione correctamente
 * Lo beans que creara, irá en funcion de los staters que hemos añadido a 
 * nuestra aplicacion. Por ejemplo, si añadimos un stater web, automaticamente
 * se configurara un Tomcat embebido en el que se desplegara la app. Si por 
 * ejemplo, hemos añadido una base de datos y JPA Data, se nos creara automaticamete
 * el data source y los drives de conexion a la bbdd. Incluso por defecto, si 
 * utilizaramos una bbdd que pueda ser creada en memoria (como H2), spring levataria
 * por defecto dicha base de datos en memoria
 *  
 */

@SpringBootApplication
@ImportResource({"classpath:applicationContext.xml"}) 
public class Application {

	public static ApplicationContext context;
	
	//Todas las aplicaciones Spring Boot tienen como punto de partida el main (no importa
	//si es web)
	public static void main(String[] args) {
		//Aqui estamos arrancando nuestro contexto de Spring
		context = SpringApplication.run(Application.class, args);
		
		Pelicula p1 = context.getBean("pelicula", Pelicula.class);
		
		p1.setId(1);
		System.out.println(p1);
		
		Pelicula p2 = context.getBean("peliculaSingleton", Pelicula.class);
		System.out.println(p2);
		
		Pelicula p3 = context.getBean("otraPelicula", Pelicula.class);
		System.out.println(p3);
	}
	
	@Bean
	public Pelicula peliculaSingleton() {
		Pelicula p = new Pelicula();
		p.setId(11);
		p.setDirector("George Lucas");
		return p;
	}

}
