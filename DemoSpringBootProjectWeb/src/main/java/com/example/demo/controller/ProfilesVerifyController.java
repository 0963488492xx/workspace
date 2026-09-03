package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
class ProfilesVerifyController {

	@PostMapping ("/profilesverify.controller")
	@ResponseBody
	public String processAction(@RequestParam String user, @RequestParam Integer age) {
		return "User:" + user +"Age:"+age;
	}
}
