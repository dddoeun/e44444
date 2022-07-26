package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/home")
	public String home() {
		
		return "안녕 여기는 스프링~!!!!!!!";
	}

}
