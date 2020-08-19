package com.diego.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.diego.springboot.web.app.models.Usuario;

@Component
@RequestMapping(value = "/app")
public class IndexController {

	// Por defecto es GET
//	@RequestMapping(value = "/", method = RequestMethod.GET) //Por defecto es GET. POST  pa formularios y PUT y DELETE para REST
//	@PostMapping -> mismo q arriba pero método post   
//	@DeleteMapping -> mismo pero para método delete

//	public String index(Map<String, Object> model) { //Entre map y ModelMap no hay diferencia
//		put("titulo", "Hola Spring con Map");

//	public ModelAndView index(ModelAndView mv) { // Entre map y ModelMap no hay diferencia
//		mv.addObject("titulo", "Titulo con ModelAndView");
//		mv.setViewName("index");
//		
//		return mv;
	@GetMapping(value = { "/index", "/", "", "/home" }) // -> a shortcut for @RequestMapping(method = RequestMethod.GET)
	public String index(Model model) { // Entre map y ModelMap no hay diferencia
		model.addAttribute("titulo", "Titulo con Model");
		return "index";
	}

	@RequestMapping("/perfil")
	public String perfil(Model modelo) {
		Usuario user = new Usuario();
		user.setApp("Meneses");
		user.setNombre("Diego");
		user.setEmail("diego@gmail.com");

		modelo.addAttribute("usuario", user);
		modelo.addAttribute("titulo", "Titulo de Perfil");

		return "perfil";
	}

	@RequestMapping("/listar")
	public String listar(Model modelo) {
		
		modelo.addAttribute("titulo", "Listado de Usuarios");
		
		return "listar";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios(){
		List<Usuario> usuarios = new ArrayList<>();
		
		usuarios.add(new Usuario("Listito", "listtador", "luis@gm.com"));
		usuarios.add(new Usuario("Jhon", "Frua", "as@gm.com"));
		usuarios.add(new Usuario("Jane", "Kaft", "bbv@gm.com"));
		usuarios.add(new Usuario("Banksy", "coco", "ccv@gm.com"));
		return usuarios;
	}

}
