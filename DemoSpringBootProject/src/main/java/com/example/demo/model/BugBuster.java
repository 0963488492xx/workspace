package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component

public class BugBuster {

	public BugBuster() {
		System.out.println("Initail BugBuster");
	}

	public void scanBug() {
		System.out.println("Scanning Bugs");
	}
	
	public void killBug() {
		System.out.println("Killing Bugs");
	}
}
