package com.example.demo.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity @Table(name = "account")
@Component
public class Account {

	@Id @Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "USERNAME")
	private String username;
	
	@Column(name = "USERPWD")
	private String userpwd;
	
	
	
	public Account() {
	}



	public Account(String username, String userpwd) {
		super();
		this.username = username;
		this.userpwd = userpwd;
	}



	public Account(Integer id, String username, String userpwd) {
		super();
		this.id = id;
		this.username = username;
		this.userpwd = userpwd;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getUserpwd() {
		return userpwd;
	}



	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

}
