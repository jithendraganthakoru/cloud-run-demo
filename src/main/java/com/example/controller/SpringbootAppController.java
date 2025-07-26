package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringbootAppController {
	
      
	@Value("${environment}")
	private String env;
	
	
	@GetMapping("/getResponse")
	public String getResponse() {
		return "Welcome to India....."+env;	
	}
}