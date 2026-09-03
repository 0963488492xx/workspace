package com.example.demo.model;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TruckBeanStaticFactoryTest {

	@Autowired @Qualifier("toyo1") //@Qualifier("toyotaTruck")
	private TruckBean truck1;

	@Autowired @Qualifier("niss1") //@Qualifier("nissanTruck")
	private TruckBean truck2;
	
	
	@Test
	void testGeTruckBean() {
		System.out.println("ID1:" + truck1.getId());
		System.out.println("Breand1:" + truck1.getBrand());
		
		System.out.println("ID2:" + truck2.getId());
		System.out.println("Breand2:" + truck2.getBrand());
	}

}
