package com.diego.springboot.web.app.models;

public class Usuario {
	private String nombre;
	private String app;
	private String email;
	
	public Usuario() {}
	
	public Usuario(String nombre, String app, String email) {
		this.nombre = nombre;
		this.app = app;
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApp() {
		return app;
	}
	public void setApp(String app) {
		this.app = app;
	}
	
}
