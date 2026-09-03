package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DataBaseProperties;
@RestController
public class DataBasePropertiesController {

	@Autowired
	private DataBaseProperties dbp;
	
	//http://localhost:8081/dbp.controller
	
	@GetMapping("/dbp.controller")
	public DataBaseProperties processAction() {
		return dbp;
	}
}
