package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping(value = "/getStudents")
	public List<Student> fetchStudent(){
		return service.fetchStudents();
	}
	
	@PostMapping(value = "/addStudents")
	public String addStudent(){
		List<Student> asList = Arrays.asList(
				new Student(1,"gitanjali","SSC"),
				new Student(2,"atul","HSC"),
				new Student(3,"suraj","HSC")
				);
		service.addStudent(asList);
		return "successfully added 3 students";
	}
	
	@GetMapping(value = "/getStudent/{id}")
	public Optional<Student> fetchStudent(@PathVariable("id") int id){
		return service.fetchStudent(id);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public String deleteStudent(@PathVariable("id")int studentId) {
		service.deleteStudent(studentId);
		return "successfully deleted student";
	}

}
