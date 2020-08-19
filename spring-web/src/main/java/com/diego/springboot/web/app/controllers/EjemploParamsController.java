package com.diego.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {

	@GetMapping("/")
	public String index(){
		return "/params/index";
	}
	
	@GetMapping("/string")
	public String params(@RequestParam(name="texto", required = false, defaultValue = "Vacío") String texto, Model model) {//	@RequestParam captura los datos que se mandan
		model.addAttribute("resultado", "El parametro enviado es: " + texto);
		return "params/ver";
	}
	
}
