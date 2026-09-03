package com.example.demo.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity @Table(name = "house")
@Component
public class House {

	@Id @Column(name = "HOUSEID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer houseid;
	
	@Column(name = "HOUSENAME")
	private String housename;
	
	
	public House() {
		
	}


	public House(Integer houseid, String housename) {
		super();
		this.houseid = houseid;
		this.housename = housename;
	}


	public Integer getHouseid() {
		return houseid;
	}


	public void setHouseid(Integer houseid) {
		this.houseid = houseid;
	}


	public String getHousename() {
		return housename;
	}


	public void setHousename(String housename) {
		this.housename = housename;
	}
	
	
	
	
	
	
}
