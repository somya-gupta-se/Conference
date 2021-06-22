package com.baniacode.conference.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baniacode.conference.User;

@RestController
public class UserController {
	
	@GetMapping("/user")
	public User getUser(@RequestParam(value="firstname", defaultValue="Somya") String firstName,
			@RequestParam(value="lastname", defaultValue="Gupta") String lastName,
			@RequestParam(value="age", defaultValue="20") int age) {
		User user = new User();
		
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setAge(age);
		
		return user;
	}
	
	@PostMapping("/user")
	public User postUser(User user) {
		System.out.println("User firstname - "+user.getFirstName());
		return user;
	}

}
