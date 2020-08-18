package com.diego.springboot.web.app.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping(value = "/app")
public class IndexController {
	
	// Por defecto es GET
//	@RequestMapping(value = "/", method = RequestMethod.GET) //Por defecto es GET. POST  pa formularios y PUT y DELETE para REST
//	@PostMapping -> mismo q arriba pero método post   
//	@DeleteMapping -> mismo pero para método delete
	
	@GetMapping(value = {"/index", "/", "/home"}) // -> a shortcut for @RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "index";
	}
}
