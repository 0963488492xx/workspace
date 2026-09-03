package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;

@RestController  //@Controller + @ResposeBody
public class PersonController {

	//http://localhost:8081/person.controller
	
	
	@Autowired
	private Person person;
	
	@GetMapping("/person.controller")  //application/json
	public Person processAction() {
		return person;
	}
}
