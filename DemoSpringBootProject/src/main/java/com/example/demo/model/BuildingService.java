package com.example.demo.model;

public class BuildingService {
	
	private BuildingDao bDao;	
	
	public BuildingService(BuildingDao bDao) {
		this.bDao = bDao;
	}

	public void showInfo() {
		bDao.showInfo();
	}

}
