package es.curso.spring02;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring02 {

	public static ApplicationContext contexto = null;
	
	public static void main(String[] args) {
		//Mediante esta clase damos de alta el contexto de Spring mediante
		//un xml que este en nuestro classpath
		contexto = new ClassPathXmlApplicationContext("ApplicationContext02.xml");

		Persona p1 = contexto.getBean("persona1", Persona.class);
		//Cuando apuntamos a un objeto prototype, spring nos crea un objeto igual al
		//objeto prototipado, pero es importante darse cuanta de que dicho objeto
		//que nos devuelve no se ha creado dentro del contexto de spring, y por lo
		//tanto el ciclo de vida de este objeto dependera del programador
		Persona p2 = contexto.getBean("personaPrototype", Persona.class);
		
		
		List<Persona> listaPersonas = contexto.getBean("listaPersonas", List.class);
		listaPersonas.add(p2);
		
		p2 = contexto.getBean("personaPrototype", Persona.class);
		p2.setNombre("Harry Callahan");
		listaPersonas.add(p2);
		
		for(Persona p : listaPersonas) {
			System.out.println(p);
		}
		
		System.out.println(p1);
	}

}
