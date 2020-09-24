package com.dxc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dxc.dao.StudentRepository;
import com.dxc.model.Student;

@Service
public class StudentServiceImplementation implements StudentService {

	public StudentServiceImplementation() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	@Transactional
	public List<Student> findAll() {
		return studentRepository.findAll();	}

	@Override
	@Transactional
	public void save(Student theStudent) {
		
		studentRepository.save(theStudent);
	}

	@Override
	@Transactional
	public Student findById(int id) {
		Optional<Student> result = studentRepository.findById(id);
		
		Student theStudent = null;
		
		if (result.isPresent()) {
			theStudent = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find employee id - " + id);
		}
		
		return theStudent;
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}

	
}