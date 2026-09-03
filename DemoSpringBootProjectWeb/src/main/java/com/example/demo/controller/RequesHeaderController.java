package com.example.demo.controller;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequesHeaderController {
	
	@GetMapping("/singleheader.controller")
	public String processAction1(@RequestHeader(name = "user-agent" , required = true, defaultValue = "no info") String userAgent) {
		return "UserAgent" + userAgent;
	}
	
	@GetMapping("/allheaders.controller")
	public Set<Entry<String, String>> processAction2(@RequestHeader Map<String, String> headers) {
		Set<Entry<String, String>> mapping = headers.entrySet();
		Set<String> keys = headers.keySet();
		Collection<String> values = headers.values();
		
		System.out.println("mapping:" + mapping);
		System.out.println("keys:" + keys);
		System.out.println("values:" + values);
		
		return mapping;
	}
	
	
	
	
	
	
	
	
}
