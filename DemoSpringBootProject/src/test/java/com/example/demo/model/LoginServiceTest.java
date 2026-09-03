package com.example.demo.model;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class LoginServiceTest {

	@Autowired
	private LoginDao lDao;
	@Autowired
	private LoginService lService;
	
	@Test
	void testCheckLogin() {
		boolean result1 = lDao.checkLogin("john", "test123");
		System.out.println("result1:"+result1);
		
		boolean result2 = lService.checkLogin("mary","1234567");
		System.out.println("result2:"+result2);
	}

}
