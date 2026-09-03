package com.example.demo.model;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BuildingServiceTest {

	@Autowired
	private BuildingService bs;
	
	@Test
	void testShowInfo() {
		bs.showInfo();
	}

}
