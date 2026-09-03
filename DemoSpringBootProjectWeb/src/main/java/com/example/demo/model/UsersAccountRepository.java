package com.example.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersAccountRepository extends JpaRepository<UsersAccount, Integer> {

	public UsersAccount findByUsername(String username);
}
