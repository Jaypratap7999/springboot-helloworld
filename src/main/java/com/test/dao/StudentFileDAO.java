package com.test.dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.model.Student;

public class StudentFileDAO  //data access object
{
	
	Student s = new Student(7999,"AZAD SINGH", 22);
	List<Student> studentList;
	
	
	public StudentFileDAO() 
	{
		
		this.studentList = readFile();	
		
	}

	public Student create(Student student) {
		
		studentList.add(student);
		writeFile();
		return s;
	}
	
    public Student update() {
		writeFile();
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
    	writeFile();
    	return student1;
	}
    
    private  List<Student> readFile() {
    	File file = new File("abcd.Json");
    	ObjectMapper mapper = new ObjectMapper();
    	TypeReference  reference = new TypeReference<List<Student>>() {};
        List<Student> studentContent;
        try {
			studentContent = (List<Student>) mapper.readValue(file, reference);
		} catch (IOException e) {
			e.printStackTrace();
			studentContent = new ArrayList<Student>();
		}
    	return  studentContent;
    	
    }
    
    private void writeFile() {
    	File file = new File("abcd.Json");
    	ObjectMapper mapper = new ObjectMapper();
    	try {
			mapper.writer().writeValue(file, studentList);
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
     }

}
