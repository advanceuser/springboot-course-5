package com.luis.curso.springboot.error.models.domain;

public class User {

	private Long id;
	private String name;
	private String lastName;
	private Role rol;

	public User() {

	}

	public User(Long id, String name, String lastName) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Role getRol() {
		return rol;
	}

//	public String getRolName() {
//		return rol.getName();
//	}

	public void setRol(Role rol) {
		this.rol = rol;
	}

}
