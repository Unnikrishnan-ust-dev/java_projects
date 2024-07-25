package com.ust.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/rest/service")
public class HelloController {

	@GetMapping("/message")
	public String hello() {
		return "Hellon user";
	}
	
	@GetMapping("/factorial/{number}")
	public String getFactorial(@PathVariable int number) {
		int fact = 1;
		for(int i=1;i<=number;i++) {
			fact *= i;
		}
		return "The factorial of " + number + " is " + fact;
	}
}
