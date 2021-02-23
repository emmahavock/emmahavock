package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import interfaceService.IUsuarioService;
import model.usuario;

@Controller
@RequestMapping
public class UsuarioController {

	@Autowired
	private IUsuarioService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<usuario> usuario = service.listar();
		model.addAttribute("usuario", usuario);
		return "index";
	}
	@GetMapping("/eliminar/{id}")
	public String delete(Model model, @PathVariable int id){
		return "redirect:/listar";
		
	}
	
	@GetMapping("/nombre")
	public String nombreForm (Model model) {
		model.addAttribute("usuario", new usuario());
		return "nombreForm";
		
	}

	@GetMapping("/find")
	public String findName(@RequestParam  String nombre, Model model, @ModelAttribute ("nombre") usuario usuario ) {
		model.addAttribute("findNombre", service.findName(nombre));
		return  "nombreform";
	}
	
	@GetMapping("/apellido")
	public String apellidoForm (Model model) {
		model.addAttribute("usuario", new usuario());
		return "nombreform";
		
	}

	@GetMapping("/findApellido")
	public String findApellido(@RequestParam  String apellido, Model model, @ModelAttribute ("apellido") usuario usuario ) {
		model.addAttribute("findApellido", service.findApellido(apellido));
		return  "apellidoform";
	}
	
}
