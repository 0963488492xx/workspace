package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;

@Controller
public class HttpSessionController {

	@GetMapping("/httpsession1.controller")
	@ResponseBody
	public String processAction(HttpSession session) {

		if (session.isNew()) {
			String sessionId = session.getId();
			return "sessionId:" + sessionId;
		}

		session.invalidate();
		return "Session Destroyed";
	}

	@GetMapping("/httpsession2.controller")
	@ResponseBody
	public String processAction2(HttpSession session) {
		if (session.isNew()) {
			session.setAttribute("user", "john");
			session.setMaxInactiveInterval(6);
			String sessionId2 = session.getId();
			return "sessionId2:" + sessionId2;
		}
		
		String userName = (String) session.getAttribute("user");
		return "userName:" + userName;
	}
	
	@GetMapping("/httpsession3.controller")
	public String processAction3(HttpSession session) {
		
		String sessionId = session.getId();
		System.out.println(sessionId);
		session.setAttribute("sessionId", sessionId);
		session.setAttribute("user", "karen");
		session.setAttribute("age", 25);
		
		return "showSessionResult";
	}

}