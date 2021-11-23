package es.curso.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.curso.modelo.entidad.Usuario;

@Controller
public class ControladorUsuario {

	@Autowired
	private Usuario usuario;
	
	@PostMapping("doLogin")
	public String doLogin(@RequestParam("nombre") String nombre,
			@RequestParam("pass") String pass) {
		//Aqui habria que preguntar a negocio si el usuario y el password son
		//correctos
		usuario.setNombre(nombre);
		usuario.setPassword(pass);		
		return "redirect:verFormulario";
	}
}
