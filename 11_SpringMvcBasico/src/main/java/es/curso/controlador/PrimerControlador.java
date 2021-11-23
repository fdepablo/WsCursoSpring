package es.curso.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrimerControlador {

	@RequestMapping("primerAcceso")
	public String miMetodo() {
		return "bienvenida";
	}
}
