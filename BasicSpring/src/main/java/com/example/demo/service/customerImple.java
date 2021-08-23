package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.customerEntity;
import com.example.demo.reposistory.customerRepository;
@Service
public class customerImple{
	@Autowired
   private customerRepository  CustomerDB;
	List<customerEntity> list=new ArrayList<>();
	public customerEntity saveToList(customerEntity details) {
		// TODO Auto-generated method stub
		list.add(details);
		return CustomerDB.save(details);
		
	}
	public List<customerEntity> getToList() {
		// TODO Auto-generated method stub
		return list;
	}

}
