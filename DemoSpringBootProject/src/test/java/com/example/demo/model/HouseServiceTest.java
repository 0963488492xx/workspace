package com.example.demo.model;






import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class HouseServiceTest {

	@Autowired
	private HouseService hService;
	
	@Test
	void testSelectById() {
		House resultBean = hService.selectById(1000);
		
		if (resultBean!=null) {
			System.out.println(resultBean.getHouseid() + " " + resultBean.getHousename());
		}else {
			System.out.println("No Result");
		}
	}

	@Test
	void testSelectAll() {
	List<House> lists = hService.selectAll();
		for (House hBean : lists) {
			System.out.println(hBean.getHouseid() + " " + hBean.getHousename());
		}
	}

	@Test
	void testInsert() {
		House resultBean = hService.insert("Great House");
		System.out.println(resultBean.getHouseid() + " " + resultBean.getHousename());
		
	}
	@Test
	void testUpdate() {
		String result = hService.update(1002, "Nice House");
		System.out.println("result:" + result);
	}
	
//	@Test
	void testDeleteById() {
		boolean result = hService.deleteById(1002);
		System.out.println("result2:" + result);
	}
}
