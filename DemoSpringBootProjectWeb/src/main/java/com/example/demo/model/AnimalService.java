package com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AnimalService {

	
	@Autowired
	private AnimalRepository aRepos;
	
	public List<Animal> selectAll(){
		return aRepos.findAll();
	}
}
