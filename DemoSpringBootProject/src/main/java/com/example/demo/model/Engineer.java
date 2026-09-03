package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Engineer {
	
	@Autowired
	private BugBuster bugBuster;
	
	public void codeCheckAndFix() {
		bugBuster.scanBug();
		bugBuster.killBug();
	}

}
