package com.example.demo.model;





import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class TruckBeanTest {
 
	@Autowired
	private TruckBean truck;
	
	@Test
	void testGetId() {
		int id = truck.getId();
		System.out.println("id:" + id);
	}

	@Test
	void testGetBrand() {
		String brand = truck.getBrand();
		System.out.println("brand1:" + brand);
	}

	@Test
	void testTruckBean() {
		int id2 = truck.getId();
		String brand2 = truck.getBrand();
		
		System.out.println("id2:" + id2);
		System.out.println("brand2:" + brand2);
	}
	
	
	
	
	
	
	
	
	
	
}
