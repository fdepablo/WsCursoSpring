package es.curso.spring06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring06 {

	public static ApplicationContext contexto = null;
	
	public static void main(String[] args) {
		//Mediante esta clase damos de alta el contexto de Spring mediante
		//un xml que este en nuestro classpath
		contexto = new ClassPathXmlApplicationContext("ApplicationContext06.xml");
		
		Persona p1 = contexto.getBean("p1", Persona.class);
		System.out.println(p1);
		
		Cliente c1 = contexto.getBean("cliente", Cliente.class);
		System.out.println(c1);
		
		Cliente c2 = contexto.getBean("cliente2", Cliente.class);
		System.out.println(c2);
	}

}
