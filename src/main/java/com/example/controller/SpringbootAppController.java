package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringbootAppController {
	
	
	@GetMapping("/getResponse")
	public String getResponse() {
		
		return "Welcome to India";	
	}
}