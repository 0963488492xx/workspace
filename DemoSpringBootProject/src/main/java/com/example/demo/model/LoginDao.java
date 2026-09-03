package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component //LoginDao loginDao = new LoginDao();
public class LoginDao {

	public boolean checkLogin(String user, String pwd) {
		if ("john".equals(user) && "test123".equals(pwd)) {
			return true;
		}
		return false;
	}
}
