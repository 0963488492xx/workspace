package com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UsersService {

	@Autowired
	private UsersRepository uRepos;
	
	public List<Users> findUsers(String username){
		return uRepos.findUsers(username);
	}
	
	public Users findByUsername(String username) {
		return uRepos.findByUsername(username);
	}
	
	public Users findByIdAndUsername(Integer id,String username) {
		return uRepos.findByIdAndUsername(id, username);
	}
	
	
	public List<Users> findAll(){
		return uRepos.findAll();
	}
}
