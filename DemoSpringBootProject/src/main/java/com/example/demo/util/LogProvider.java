package com.example.demo.util;

import org.springframework.stereotype.Component;

@Component	//LogProvider logProvider = newLogProvider();
public class LogProvider {

	public void log(String msg) {
		System.out.println("msg:"+msg);
	}
	
	
	
	
	
	
	
	
}
