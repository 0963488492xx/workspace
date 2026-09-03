package com.example.demo.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity @Table(name = "animal")
@Component
public class Animal {

	
	
	@Id @Column(name = "AID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer aid;
	
	@Column(name = "ANAME")
	private String aname;
	
	public Animal() {
		
	}

	public Animal(Integer aid, String aname) {
		super();
		this.aid = aid;
		this.aname = aname;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}
	
	

}
