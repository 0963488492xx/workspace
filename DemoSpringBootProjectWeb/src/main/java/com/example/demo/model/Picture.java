package com.example.demo.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity @Table(name = "picture")
@Component
public class Picture {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String filename;
	
	@JsonIgnore
	private byte[] picture;
	
	@Transient
	private String base64;
	
	public Picture() {
		
	}


	public Picture(String filename, byte[] picture) {
		super();
		this.filename = filename;
		this.picture = picture;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFilename() {
		return filename;
	}


	public void setFilename(String filename) {
		this.filename = filename;
	}


	public byte[] getPicture() {
		return picture;
	}


	public void setPicture(byte[] picture) {
		this.picture = picture;
	}


	public String getBase64() {
		return base64;
	}


	public void setBase64(String base64) {
		this.base64 = base64;
	}

}
