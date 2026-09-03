package com.example.demo.model;

public class BuildingDao {

	private Building building;

	public BuildingDao(Building building) {
		this.building = building;
	}
	
	public void showInfo() {
		System.out.println(building.getBid()+"-"+building.getBname()+"-"+building.getAge());
	}
}
