package com.venkatesh.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hell() {
		return "hello <a href='welcome'>click Here to go to Welcome Page</a>";
	}
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "<body bgcolor='skyblue'></body><h1 style='color:red;'>Welcome to Homepage...</h1>";
	}
	
	@RequestMapping("")
	public String home() {
		return "hello <a href='http://www.google.co.in'>click Here to go to Google Page</a>";
	}

}
