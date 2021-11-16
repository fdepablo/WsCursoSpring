package es.curso.spring05;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring05 {

	public static ApplicationContext contexto = null;
	
	public static void main(String[] args) {
		//Mediante esta clase damos de alta el contexto de Spring mediante
		//un xml que este en nuestro classpath
		contexto = new ClassPathXmlApplicationContext("ApplicationContext05.xml");
		
		List<String> listaNombres = contexto.getBean("listaNombres", List.class);
		for(String s : listaNombres) {
			System.out.println(s);
		}
		
		System.out.println("--------- Lista Personas ----------");
		List<Persona> listaPersonas = contexto.getBean("listaPersonas", List.class);
		for(Persona p : listaPersonas) {
			System.out.println(p);
		}
		
		System.out.println("--------- Conjunto ----------");
		Set<Persona> conjuntoPersonas = contexto.getBean("conjuntoPersonas", Set.class);
		for(Persona p : conjuntoPersonas) {
			System.out.println(p);
		}
		
		System.out.println("--------- Mapa ----------");
		Map<Integer, Persona> mapaPersonas = contexto.getBean("mapaPersonas", Map.class);
		System.out.println(mapaPersonas.get(1));
		System.out.println(mapaPersonas.get(2));
		System.out.println(mapaPersonas.get(3));
		System.out.println(mapaPersonas.get(4));
	}

}
