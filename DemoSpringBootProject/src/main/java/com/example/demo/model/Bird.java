package com.example.demo.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity @Table(name = "bird")
@Component

public class Bird {

	@Id @Column(name = "BID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bid;
	
	@Column(name = "BNAME")
	private String bname;
	
	@Column(name = "SIZE")
	private String size;
	
	@Column(name = "COLOR")
	private String color;
	
	@Column(name = "AGE")
	private Integer age;
	
	public Bird() {
		
	}

	public Bird(String bname, String size, String color, Integer age) {
		super();
		this.bname = bname;
		this.size = size;
		this.color = color;
		this.age = age;
	}

	public Bird(Integer bid, String bname, String size, String color, Integer age) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.size = size;
		this.color = color;
		this.age = age;
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
