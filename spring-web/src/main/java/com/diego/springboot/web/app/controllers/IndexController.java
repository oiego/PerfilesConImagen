package com.diego.springboot.web.app.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class IndexController {
	
//	@RequestMapping(value = "/", method = RequestMethod.GET) //Por defecto es GET. POST  pa formularios y PUT y DELETE para REST
//	@PostMapping -> mismo q arriba  
//	@DeleteMapping
	@GetMapping(value = "/") // -> a shortcut for @RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "index";
	}
}
