package com.luis.curso.springboot.error.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luis.curso.springboot.error.models.domain.User;

@Service
public class UserServiceImpl implements UserService {

	/**
	 * Este fragmento se mueve a una clase de configuracion para ser leido por el
	 * contenedor de beans para que se pueda inyectar con el codigo de abajo
	 */
//	private List<User> users;
//
//	public UserServiceImpl() {
//		this.users = new ArrayList<>();
//		users.add(new User(1L, "Pepe", "Gonzalez"));
//		users.add(new User(2L, "Andrez", "Mena"));
//		users.add(new User(3L, "Maria", "Perez"));
//		users.add(new User(4L, "Josefa", "Ramires"));
//		users.add(new User(5L, "Ale", "Gutierrez"));
//	}

	@Autowired
	private List<User> users;

	@Override
	public Optional<User> findById(Long id) {
		/**
		 * Cambio de codigo por programacion funcional
		 */
//		User user = null;
//		for (User u : users) {
//			if (u.getId().equals(id)) {
//				user = u;
//				break;
//			}
//		}
		// return Optional.ofNullable(user);
		return users.stream().filter(usr -> usr.getId().equals(id)).findFirst();
	}

	@Override
	public List<User> findAll() {
		return users;
	}

}
