package com.luis.curso.springboot.error.service;

import java.util.List;
import java.util.Optional;

import com.luis.curso.springboot.error.models.domain.User;

public interface UserService {

	Optional<User> findById(Long id);

	List<User> findAll();
}
