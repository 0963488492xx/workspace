package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.UsersAccount;
import com.example.demo.model.UsersAccountService;

@Controller
public class UsersAccountCheckController {

	@Autowired	
	private UsersAccountService uService;
	
	@PostMapping("/accountcheck.controller")
	public ResponseEntity<String> processAction(@RequestBody UsersAccount users){
		boolean status = uService.checkLogin(users);
		
		if (status) {
			return new ResponseEntity<String>("Y",HttpStatus.OK);
		}

		return new ResponseEntity<String>("N",HttpStatus.OK);
	}
}
