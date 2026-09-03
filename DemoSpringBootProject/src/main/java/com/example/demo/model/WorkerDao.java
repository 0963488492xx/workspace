package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("workerDao")
public class WorkerDao {

//	@Autowired @Qualifsier("worker2") @Qualifier("worker1")
	private Worker worker;
	
	public WorkerDao() {
		
	}
	@Autowired
	public WorkerDao ( @Qualifier ("worker2")Worker worker) {
		this.worker = worker;
	}

	public void printDetails() {
		System.out.println("id:" + worker.getId());
		System.out.println("name:" + worker.getName());
		System.out.println("title:" + worker.getTitle());
	}
	
	
}
