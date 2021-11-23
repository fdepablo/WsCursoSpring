package es.curso.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import es.curso.modelo.entidad.Persona;

@Controller
public class ControladorPersona {

	@Autowired
	private Persona persona;
	
	@Autowired
	@Qualifier("listaPersonas")
	private List<Persona> listaPersonas;
	
	@GetMapping("verFormularioPersona")
	private String verFormularioPersona(Model model) {		
		model.addAttribute("persona", persona);
		model.addAttribute("lista",listaPersonas);
		return "formularioPersona";
	}
	
	@PostMapping("/doFormularioVideojuego")
	public String addVideojuego(@ModelAttribute Persona persona) {
		System.out.println("Persona enviada: " + persona);	
		listaPersonas.add(persona);
		return "redirect:verFormularioPersona";		
	}
}
