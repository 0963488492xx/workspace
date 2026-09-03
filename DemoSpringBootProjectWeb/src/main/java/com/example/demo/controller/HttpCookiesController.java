package com.example.demo.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@Controller
public class HttpCookiesController {

	@GetMapping("/servletcookie.controller")
	@ResponseBody
	public String processServletCookiesAction(HttpServletResponse response) {
		Cookie cookie3 = new Cookie("yourCookie1","oreo");
		cookie3.setHttpOnly(true);
		cookie3.setMaxAge(24*60*60);
		cookie3.setPath("/");
		response.addCookie(cookie3);
		return "Set Servlet Cookie OK";
	}
	
	@GetMapping("/retrieveservletcookie.controller")
	@ResponseBody
	public String processRetrieveServletCookiesAction(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		
		String value = "empty4";
		String name = "noname";
		
		for (Cookie c1 : cookies) {
			name = c1.getName();
			if (name.equals("yourCookies1")) {
				value = c1.getValue();
			}
			
		}
		return name + ":" +value;
	}
	
	@GetMapping("/setcookies.controller")
	public ResponseEntity<String> processSetResponseCookiesAction(){
		ResponseCookie cookie = ResponseCookie.from("mycookies","chocolate")
											.httpOnly(true)
											.path("/")
											.maxAge(24*60*60*30)
											.sameSite("Lax")
											.build();
		return ResponseEntity.ok()
							.header(HttpHeaders.SET_COOKIE, cookie.toString())
							.body("Set Cookies OK");
	}
	
	@GetMapping("/setmultiplecookies.controller")
	public ResponseEntity<String> processSetMultipleCookiesAction(){
		ResponseCookie cookie1 = ResponseCookie.from("mycookies1","cake")
												.httpOnly(true)
												.path("/")
												.maxAge(24*60*60*30)
												.sameSite("Lax")
												.build();
		ResponseCookie cookie2 = ResponseCookie.from("mycookies2","sandwich")
												.httpOnly(true)
												.path("/")
												.maxAge(24*60*60*30)
												.sameSite("Lax")
												.build();
		
		return ResponseEntity.ok()
							.header(HttpHeaders.SET_COOKIE, cookie1.toString())
							.header(HttpHeaders.SET_COOKIE, cookie2.toString())
							.build();
	}
	
	
	
	@GetMapping("/retrievecookie")
	@ResponseBody
	public String processRetrieveCookieAction(@CookieValue(defaultValue = "empty", required = true) String mycookies){
		return "myCookie:" + mycookies;
	}
	
	@GetMapping("/retrievemultiplecookies")
	@ResponseBody
	public String processRetrieveMultipleCookiesAction(@CookieValue(defaultValue = "empty1") String mycookies1, @CookieValue(defaultValue = "empty2") String mycookies2) {
		return "myCookie1:" + mycookies1 + "<br/>myCookie2:" + mycookies2;
	}
	
}
