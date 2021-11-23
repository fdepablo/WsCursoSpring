package es.curso.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import es.curso.modelo.entidad.Persona;
import es.curso.modelo.persistencia.DaoPersona;

@Controller
public class ControladorPersona {

	@Autowired
	private Persona persona;
	
	@Autowired
	private DaoPersona daoPersona;
	
	@GetMapping("verFormularioPersona")
	private String verFormularioPersona(Model model) {		
		model.addAttribute("persona", persona);
		model.addAttribute("lista",daoPersona.findAll());
		return "formularioPersona";
	}
	
	@PostMapping("/doFormularioVideojuego")
	public String addVideojuego(@ModelAttribute Persona persona) {
		System.out.println("Persona enviada: " + persona);	
		daoPersona.save(persona);
		return "redirect:verFormularioPersona";		
	}
}
