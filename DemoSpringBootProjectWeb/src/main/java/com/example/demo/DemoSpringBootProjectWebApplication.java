package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@ComponentScan(basePackages = {"tw.com.example.demo")
@PropertySource(value = {"jdbc.properties"}, ignoreResourceNotFound = true)
public class DemoSpringBootProjectWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootProjectWebApplication.class, args);
	}

}
