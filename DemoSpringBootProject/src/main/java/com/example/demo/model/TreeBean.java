package com.example.demo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:tree.properties")
public class TreeBean {
	
	private final static int num = 6;
	
	
	
//	@Value("#{props.name}")
	@Value("${name}")
	private String name;
	
//	@Value("#{props.age}")
	@Value("${age}")
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}

