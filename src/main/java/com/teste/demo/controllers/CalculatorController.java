package com.teste.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/calculator")
public class CalculatorController {

  @GetMapping
	public ResponseEntity<String> soma() {
		return ResponseEntity.ok("Deployed from jenkins and k8s!!!");
	}
    
}
