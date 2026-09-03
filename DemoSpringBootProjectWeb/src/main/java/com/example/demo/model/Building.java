package com.example.demo.model;

public class Building {

	private Integer buildingId;
	private String buildingname;
	private Integer buildingage;

	
	public Building() {
		
		
	}

	
	
	public Building(String buildingname, Integer buildingage) {
		super();
		this.buildingname = buildingname;
		this.buildingage = buildingage;
	}




	public Building(Integer buildingId, String buildingname, Integer buildingage) {
		super();
		this.buildingId = buildingId;
		this.buildingname = buildingname;
		this.buildingage = buildingage;
	}



	public Integer getBuildingId() {
		return buildingId;
	}




	public void setBuildingId(Integer buildingId) {
		this.buildingId = buildingId;
	}




	public String getBuildingname() {
		return buildingname;
	}




	public void setBuildingname(String buildingname) {
		this.buildingname = buildingname;
	}




	public Integer getBuildingage() {
		return buildingage;
	}




	public void setBuildingage(Integer buildingage) {
		this.buildingage = buildingage;
	}





}
