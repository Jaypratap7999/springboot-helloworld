package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.model.Student;

@RestController
public class FirstController {
	
	
	Student s = new Student(123,"AZAD", 23);
	
    @GetMapping("/hello")
	public Student doXyz() 
	{
		return s;
		
	}
    
    @GetMapping("/usaki")
	public String usakiChalo() 
	{
		return "chalo Usaki boriya bistar bandho";
		
	}
	

}
