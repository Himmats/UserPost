package com.demo.userpost.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController	
public class AppController {
	
	@Autowired
	RestTemplate template;
	
	@GetMapping("/getPosts")
	public List home() {
		return template.getForObject("https://jsonplaceholder.typicode.com/posts", List.class);
	}
}
