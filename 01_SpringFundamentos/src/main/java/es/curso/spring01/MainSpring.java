package es.curso.spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static ApplicationContext contexto = null;
	
	public static void main(String[] args) {
		//Mediante esta clase damos de alta el contexto de Spring mediante
		//un xml que este en nuestro classpath
		contexto = new ClassPathXmlApplicationContext("ApplicationContext01.xml");
		
		//Podeos castear el objeto al tipo que queramos
		Mensaje m1 = (Mensaje)contexto.getBean("mensaje1");
		//otra manera es diciendole a spring el tipo de dato al que queremos convertir
		Mensaje m2 = contexto.getBean("mensaje1", Mensaje.class);
		
		m1.setDestinatario("Steve Rogers");
		m1.setCuerpo("Hemos quedado para matar a thanos");
		
		System.out.println(m2);
		System.out.println(m1);
		
		Mensaje m3 = new Mensaje();
		m3.setDestinatario("Tony Stark");
		m3.setCuerpo("Vamos a jugar a las cartas");
		
		//puedo cambiar las referencias m1 y m2 sin miedo a perder el objeto
		m1 = null;
		m2 = null;
		m3 = null;
		
		Mensaje m4 = contexto.getBean("mensaje1", Mensaje.class);
		System.out.println(m4);
		
		m1 = contexto.getBean("mensajeRelleno", Mensaje.class);
		System.out.println(m1);
		m1.setCuerpo("Vamonos a la discoteca!!");
		
		m2 = contexto.getBean("mensajeRelleno", Mensaje.class);
		System.out.println(m2);
		
		
	}

}
