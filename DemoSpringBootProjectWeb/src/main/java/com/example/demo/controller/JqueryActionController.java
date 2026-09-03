package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JqueryActionController {

	@GetMapping("/jqueryaction1.controller")
	public String processJqueryAction1() {
		return "have a good time";
	}
	
	@PostMapping("/jqueryaction2.controller")
	public String processAction2() {
		return "to see is to believe";
	}
}
