package com.example.demo.model;

import org.springframework.stereotype.Component;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity @Table(name = "profiles")
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Profiles {

	@Id @Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NonNull
	@Column(name = "NAME")
	private String name;
	
	@NonNull
	@Column(name = "ADDRESS")
	private String address;
	
	@NonNull
	@Column(name = "PHONE")
	private String phone;
}
