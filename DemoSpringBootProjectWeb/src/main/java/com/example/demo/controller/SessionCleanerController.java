package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

//@RestController
@Controller
@SessionAttributes(names = {"player","level"})
public class SessionCleanerController {
	
	@GetMapping("/sessioncleaner.controller")
	public String processAction(SessionStatus status) {
		status.setComplete();
//		return "Session Clean";
		return "redirect:/testsession.controller";
	}
}
