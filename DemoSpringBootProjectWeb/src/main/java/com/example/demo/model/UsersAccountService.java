package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UsersAccountService {

	@Autowired
	private UsersAccountRepository uRepos;
	
	public boolean checkLogin(UsersAccount users) {
		UsersAccount resultBean = uRepos.findByUsername(users.getUsername());
		
		if (resultBean!=null) {
			return true;
		}
		
		return false; 
	}
	
}
