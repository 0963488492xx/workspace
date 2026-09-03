package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes(names = {"player","level"})
public class SessionAttributesController {

	@GetMapping("/testsession.controller")
	public String processAction2() {
		return "showSessionResult2";
	}
	
	@GetMapping("/sessionattributes.controller")
	public String processAction(Model m) {
		m.addAttribute("player","poseidon");
		m.addAttribute("level",150);
		return "showSessionResult2";
	}
}
