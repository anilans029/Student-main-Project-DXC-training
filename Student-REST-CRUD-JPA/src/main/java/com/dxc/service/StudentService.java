package com.dxc.service;

import java.util.List;


import com.dxc.model.Student;

public interface StudentService {

	public List<Student> findAll();

	public void save(Student theStudent);

	public Student findById(int id);

	public void deleteById(int id);
	
}
