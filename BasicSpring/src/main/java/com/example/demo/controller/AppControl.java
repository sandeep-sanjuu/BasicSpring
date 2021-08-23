package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.customerEntity;
import com.example.demo.reposistory.customerRepository;
import com.example.demo.service.customerImple;

@RestController
public class AppControl {
	
	//private customerRepository Customerrepository;
	@Autowired
	private customerImple customerService;

	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello() {
		return "index";
	}

	@RequestMapping("/hello1")
	public ModelAndView hello1(@RequestParam("name") String name) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("name",name);
		mv.setViewName("index");
		return mv;
	}
	
	
	@PostMapping("/saveList")
	public customerEntity saveList(@RequestBody customerEntity details) {
		//Customerrepository.save(details);
		return customerService.saveToList(details);
		
	}
	
	@GetMapping("/getList")
	public List<customerEntity> getList() {
		//Customerrepository.save(details);
		return customerService.getToList();
		
	}
	
}
