package com.example.security2020.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin()
public class AlumnoController {
	@GetMapping("/alumnos")
	public String getEmployees() {
        return "Bienvenido!";
    }
}
