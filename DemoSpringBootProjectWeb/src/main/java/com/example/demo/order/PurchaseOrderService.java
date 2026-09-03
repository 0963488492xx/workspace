package com.example.demo.order;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PurchaseOrderService {
	
	@Autowired
	private PurchaseOrderRepository poRepos;
	
	public PurchaseOrder insert(PurchaseOrder po) {
		return poRepos.save(po);
	}
	
	public PurchaseOrder selectById(Integer id) {
		Optional<PurchaseOrder> op = poRepos.findById(id);
		
		if(op.isPresent()) {
			return op.get();
		}
		
		return null;
	}
	
	public List<PurchaseOrder> selectAll(){
		return poRepos.findAll();
	}

}