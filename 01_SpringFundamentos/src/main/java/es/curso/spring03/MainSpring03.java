package es.curso.spring03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring03 {

	public static ApplicationContext contexto = null;
	
	public static void main(String[] args) {
		//Mediante esta clase damos de alta el contexto de Spring mediante
		//un xml que este en nuestro classpath
		contexto = new ClassPathXmlApplicationContext("ApplicationContext03.xml");

		Persona p1 = contexto.getBean("mortadelo", Persona.class);
		System.out.println(p1);
		
		p1 = contexto.getBean("filemon", Persona.class);
		System.out.println(p1);
		
		Persona p2 = contexto.getBean("persona", Persona.class);
		p2.setNombre("Vicente");
		p2.getDireccion().setCiudad("Barcelona");
		
		System.out.println(p2);
		
		Persona p3 = new Persona();
		p3.setDireccion(new Direccion());
		p3.setNombre("Ofelia");
		p3.getDireccion().setCiudad("Sevilla");
		
		System.out.println(p3);
	}

}
