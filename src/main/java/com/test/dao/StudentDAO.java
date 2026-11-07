package com.test.dao;

import java.util.ArrayList;
import java.util.List;

import com.test.model.Student;

public class StudentDAO  //data access object
{
	Student s = new Student(7999,"AZAD SINGH", 22);
	List<Student> studentList = new ArrayList<Student>();
	public Student create(Student student) {
		
		studentList.add(student);
		return s;
	}
	
    public Student update() {
		
    	return s;
	}
    
    public List<Student> read() {
		
    	return studentList;
	}
    
    public Student delete(int id) {
    	Student student1 = studentList.stream().filter(student -> student.id == id).findFirst().orElse(null);
    	if(student1 != null) {
		studentList.remove(student1);
    	}
    	return student1;
	}

}
