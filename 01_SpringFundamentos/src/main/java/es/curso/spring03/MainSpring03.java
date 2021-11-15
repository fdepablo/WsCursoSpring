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
	}

}
