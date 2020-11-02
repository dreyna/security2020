package com.example.security2020.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.security2020.model.Usuario;

public interface UserRepository extends CrudRepository<Usuario, Integer> {
	Usuario findByUsername(String username);
}
