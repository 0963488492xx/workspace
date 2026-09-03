package com.example.demo.model;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class HouseService {

	@Autowired
	private HouseDao hDao;
	
	public House selectById(Integer id) {
		return hDao.selectById(id);
	}
	
	public List<House> selectAll(){
		return hDao.selectAll();
		}
	
	public House insert(String houseName) {
		return hDao.insert(houseName);
	}
	
	public String update(Integer houseid,String houseName) {
		return hDao.update(houseid, houseName);
	}
	
	public boolean deleteById(Integer houseid) {
		return hDao.deleteById(houseid);
	}
}
