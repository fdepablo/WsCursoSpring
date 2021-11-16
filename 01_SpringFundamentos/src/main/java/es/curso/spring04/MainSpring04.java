package es.curso.spring04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring04 {

	public static ApplicationContext contexto = null;
	
	public static void main(String[] args) {
		//Mediante esta clase damos de alta el contexto de Spring mediante
		//un xml que este en nuestro classpath
		contexto = new ClassPathXmlApplicationContext("ApplicationContext04.xml");
		
		Persona p1 = contexto.getBean("persona1", Persona.class);
		System.out.println(p1);
		
		Persona p2 = contexto.getBean("persona2", Persona.class);
		System.out.println(p2);
		
		Persona p3 = contexto.getBean("persona3", Persona.class);
		System.out.println(p3);
		
		Persona p4 = contexto.getBean("persona4", Persona.class);
		System.out.println(p4);
		
		Direccion d1 = contexto.getBean("direccion1", Direccion.class);
		System.out.println(d1);
	}

}
