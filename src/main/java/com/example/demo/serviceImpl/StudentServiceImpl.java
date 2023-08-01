package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepo repo;

	@Override
	public void addStudent(List<Student> studentlist) {
		repo.saveAll(studentlist);
	}

	@Override
	public List<Student> fetchStudents() {
		return repo.findAll();
	}

	@Override
	public void deleteStudent(int id) {
		repo.deleteById(id);
	}

	@Override
	public Optional<Student> fetchStudent(int id) {
		return repo.findById(id);
	}

}
