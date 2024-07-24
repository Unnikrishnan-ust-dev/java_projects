package com.ust.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController()
@RequestMapping("/client")
public class ClientController {

	@Autowired
	RestTemplate template;
	
	@GetMapping
	public ResponseEntity<String> connect() {
		String url = "https://bored-api.appbrewery.com/random";
		
		ResponseEntity<String> response = template.getForEntity(url, String.class);
		return response;
	}
}
