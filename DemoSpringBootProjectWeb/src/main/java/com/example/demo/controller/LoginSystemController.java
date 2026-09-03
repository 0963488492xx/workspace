package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.model.Account;
import com.example.demo.model.AccountService;



@Controller
@SessionAttributes(names = "loginCode")
public class LoginSystemController {
	
	@GetMapping("/loginsystemmain.controller")
	public String processMainAction() {
		return "loginSystem";
	}
	
	@Autowired
	private AccountService aService;
	
	@PostMapping("/checklogin.controller")
	public String processAction(@RequestParam String userName, @RequestParam String userPwd, Model m) {
		Map<String, String> errors = new HashMap<String,String>();
		m.addAttribute("errors", errors);
		
		if(userName==null || userName.length()==0) {
			errors.put("name", "username is required");
		}
		
		if(userPwd==null || userPwd.length()==0) {
			errors.put("pwd", "user password is required");
		}
		
		if(errors!=null && !errors.isEmpty()) {
			return "loginSystem";
		}
		
		boolean status = aService.checkLogin(new Account(userName, userPwd));
		
		if(status) {
			m.addAttribute("user", userName);
			m.addAttribute("pwd", userPwd);
			m.addAttribute("loginCode", new Account(userName, userPwd));
			return "loginSuccess";
		}
		
		errors.put("msg", "please input username or password correctly");
		return "loginSystem";
	}

}
