package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.dao.StudentDAO;
import com.test.model.Student;

@RestController
public class StudentController 
{
	StudentDAO sd = new StudentDAO();
	
	@GetMapping("/jay")
	public Student doSomething() {
		return sd.create();
	}
	
	@GetMapping("/azad")
	public Student doSomething1() {
		return sd.read();
	}
	

}
