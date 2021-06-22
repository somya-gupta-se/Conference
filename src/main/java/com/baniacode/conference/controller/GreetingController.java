package com.baniacode.conference.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

	@GetMapping("greeting")
	public String greeting(Map<String, Object> Model) {
		Model.put("message", "Hello Dear");
		return "greeting";
	}
	
	@GetMapping("thyme")
	public String thyme(Map<String, Object> Model) {
		Model.put("message", "Hello thymeleaf");
		return "thyme";
	}
	
}
