package com.test.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.dao.StudentDAO;
import com.test.dao.StudentFileDAO;
import com.test.model.Student;

@RestController
@RequestMapping("api/students")
public class StudentController 
{
	//StudentDAO sd = new StudentDAO();
	StudentFileDAO sd = new StudentFileDAO();
	
	@PostMapping
	public Student postStudent(@RequestBody Student student) {
		return sd.create(student);
	}
	@GetMapping
	public List<Student> getStudent() {
		return sd.read();
	}
	
	@PutMapping
	public Student putStudent() {
		return sd.update();
	}
	
	@DeleteMapping("/{id}")
	public Student deleteStudent(@PathVariable int id ) {
		return sd.delete(id);
	}
	

}
