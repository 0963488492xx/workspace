package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Building;

@RestController
public class JsonCreatorController {

	
	@GetMapping("/jsoncreator1.controller")
	public Building processAction1() {
		Building build1 = new Building(1000, "Taipei 101",21);
		return build1;
	}
	
	
	@GetMapping("/jsoncreator2.controller")
	public ArrayList<Building> processAction2(){
		Building build2 = new Building(1001, "Burj Khalifa Tower", 15);
		Building build3 = new Building(1002, "Shanghai Tower", 10);
		
		ArrayList<Building> buildings = new ArrayList<Building>();
		buildings.add(build2);
		buildings.add(build3);
		
		return buildings;
	}
	
	@GetMapping("/jsoncreator3.controller")
	public Map<String, Object> processAction3() {
		
		Building build4 = new Building(1003,"Zoo",20);
		Building build5 = new Building(1004,"Museum",25);
		
		ArrayList<Building> buildings = new ArrayList<Building>();
		buildings.add(build4);
		buildings.add(build5);
		
		int size = buildings.size();
		
		Map<String, Object> info = new HashMap<String, Object>();
		info.put("size", size);
		info.put("buildings", buildings);
		info.put("location", "taipei");
		
		return info;
	}
}
