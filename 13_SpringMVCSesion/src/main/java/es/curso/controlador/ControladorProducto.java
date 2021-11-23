package es.curso.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import es.curso.modelo.entidad.Producto;
import es.curso.modelo.entidad.Usuario;

@Controller
public class ControladorProducto {
	
	@Autowired
	private Usuario usuario;
	
	@Autowired
	private Producto producto;
	
	@Autowired
	private Integer contadorProducto;
	
	@GetMapping("verFormulario")
	public String verFormulario(Model model) {
		model.addAttribute("usuario", usuario);
		model.addAttribute("producto", producto);
		return "formulario";
	}	
	
	@PostMapping("addProducto")
	public String addProducto(@ModelAttribute Producto producto) {
		producto.setId(contadorProducto++);
		usuario.getListaProductos().add(producto);
		return "redirect:verFormulario";
	}	
	
	
}
