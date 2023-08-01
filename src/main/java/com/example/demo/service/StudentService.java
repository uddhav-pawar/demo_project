package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Student;

@Component
public interface StudentService {
	
	void addStudent(List<Student> studentList);
	
	List<Student> fetchStudents();
	
	void deleteStudent(int id);

	Optional<Student> fetchStudent(int id);
	
	

}
