package com.example.demo.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EngineerTest {

	@Autowired
	private Engineer engineerBean;
	
	
	
	@Test
	void testCodeCheckAndFix() {
		engineerBean.codeCheckAndFix();
	}

}
