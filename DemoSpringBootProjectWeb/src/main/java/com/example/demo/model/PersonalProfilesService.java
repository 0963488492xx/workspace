package com.example.demo.model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PersonalProfilesService {

	@Autowired
	private PersonalProfilesRepository ppRepos;
	
	public PersonalProfiles insert(PersonalProfiles pp) {
		return ppRepos.save(pp);
	}
	
	public PersonalProfiles update(PersonalProfiles pp) {
		return ppRepos.save(pp);
	}
	
	public void deleteById(Integer id) {
		ppRepos.deleteById(id);
	}
	
	public PersonalProfiles getById(Integer id) {
		Optional<PersonalProfiles> op = ppRepos.findById(id);
		
		if (op.isPresent()) {
			return op.get();
		}
		return null;
	}
	
	public List<PersonalProfiles> selectAll(){
		return ppRepos.findAll();
	}
}
