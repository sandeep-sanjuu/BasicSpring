package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.customerEntity;
@Service
public interface cutomerInterface {
	public customerEntity saveToList(customerEntity details);
	public List<customerEntity> getToList();
}
