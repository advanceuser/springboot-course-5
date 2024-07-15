package com.luis.curso.springboot.error.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis.curso.springboot.error.exceptions.UserNotFoundException;
import com.luis.curso.springboot.error.models.domain.User;
import com.luis.curso.springboot.error.service.UserService;

@RestController
@RequestMapping("/app")
public class AppController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String index() {
		// int value = 100 / 0;
		int value = Integer.parseInt("20x");
		return "OK 200";
	}

	@GetMapping("/show/{id}")
	public User show(@PathVariable(name = "id") Long id) {
		User user = userService.findById(id)
				.orElseThrow(() -> new UserNotFoundException("Error, el usuario no existe"));
		// API Optional evita el uso de estas lineas de codigo vintage
//		if (user == null) {
//			throw new UserNotFoundException("Error, el usuario no existe");
//		}
		System.out.println(user.getName());
		return user;
	}

}
