package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ResponseController {

//	@GetMapping(path = "/response.controller", produces = "text/plain;charset=UTF-8")
//	@GetMapping(path = "/response.controller", produces = "text/html;charset=UTF-8")
	@GetMapping(path = "/response.controller", produces = "application/json;charset=UTF-8")
	public String processAction() {
		return "你好,How Are you?";
	}
	
	@GetMapping("/responseentity.controller")
	public ResponseEntity<String> processStatusCodeAction(){
		return new ResponseEntity<String>("Custom Status Code(403 Forbidden)", HttpStatus.FORBIDDEN);
	}
	
	
	
}
