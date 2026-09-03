package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Profiles;
import com.example.demo.model.ProfilesService;



@Controller
public class DemoCrudRestController {

	@Autowired
	private ProfilesService pService;
	
	@PostMapping("/profiles")
	@ResponseBody
	public String ProcessInsertAction(@RequestParam String userName, @RequestParam String userAddress, @RequestParam String userPhone) {
		Profiles insertBean = new Profiles(userName,userAddress,userPhone);
		pService.insert(insertBean);
		return "Insert OK";
	}
	
	@PostMapping("/profiles2")
	@ResponseBody
	public Profiles ProcessInsertAction2(@RequestBody Profiles profiles) {
		return pService.insert(profiles);
	}
	
	@GetMapping("/profiles/{profilesid}")
	@ResponseBody
	public String processQueryByIdAction(@PathVariable Integer profilesid) {
		Profiles resultBean = pService.selectById(profilesid);
		
		if (resultBean != null) {
			return resultBean.getId() + " " + resultBean.getName() + " " + resultBean.getAddress() + " " + resultBean.getPhone();
		}
		return "no result";			
	}
	
	@GetMapping("/profiles")
	@ResponseBody
	public List<Profiles> processQueryAllAction(){
		return pService.selectAll();
	}
	
	@PutMapping("/profiles/{profilesid}")
	@ResponseBody
	public String processUpdateAction(@PathVariable Integer profilesid, @RequestParam String userName, @RequestParam String userAddress,
										@RequestParam String userPhone) {
		Profiles updateBean = new Profiles(profilesid, userName, userAddress, userPhone);
		pService.update(updateBean);
		return "Update OK";
	}
	
	@CrossOrigin(origins =  "http://localhost:8082")
	@DeleteMapping("/profiles/{profilesid}")
	@ResponseBody
	public String processDeleteAction(@PathVariable Integer profilesid) {
		Profiles resulrBean = pService.selectById(profilesid);
		
		if (resulrBean != null) {
			pService.deleteById(profilesid);
			return "Delete OK";
		}
		return "Delete Not OK";
	}
	
	
	
	
	
	
	
}
