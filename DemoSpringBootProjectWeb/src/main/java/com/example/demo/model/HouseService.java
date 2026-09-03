package com.example.demo.model;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class HouseService {
	
	@Autowired
	private HouseRepository hRepos;
	
	public House selectById(Integer id) {
		Optional<House> op = hRepos.findById(id);
		
		if(op.isPresent()) {
			return op.get();
		}
		
		return null;
	}

	public List<House> selectAll(){
		return hRepos.findAll();
	}
	
}