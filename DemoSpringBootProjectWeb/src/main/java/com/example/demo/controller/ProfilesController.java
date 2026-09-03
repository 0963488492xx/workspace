package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProfilesController {
	
	@PostMapping("/profiles.controller")
	@ResponseBody
	public String processAction(@RequestParam (required = false) String userName, @RequestParam(required = false) String userAddress, @RequestParam (required = false) String userPhone) {
		return "message:" + userName + "-" + userAddress + "-" + userPhone;
	}
	
	@PostMapping("/profiles2.controller")
	@ResponseBody
	public String processFormDataAction(@RequestParam String userName, @RequestParam String[] result1) {
		System.out.println("userName:" + userName);
		System.out.println("-----------------");
		
		for (String resultInfo : result1) {
			System.out.println(resultInfo);
			
		}
		return "message:" + userName;
	}
}
