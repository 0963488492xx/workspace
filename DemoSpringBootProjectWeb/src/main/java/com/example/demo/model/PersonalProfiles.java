package com.example.demo.model;

import org.springframework.stereotype.Component;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity @Table(name = "personalprofiles")
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class PersonalProfiles {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;
	@Nonnull
	private String pname;
	
	@Nonnull
	private String paddress;
	
	@Nonnull
	private String phone;
	
	@Nonnull
	private Integer age;
	
	@Nonnull
	private String title;
	
	@Nonnull
	private Integer salary;
	
	
	
	
	
	
	
	
	
	
	
	
}
