package com.dxc.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.model.Student;
import com.dxc.service.StudentService;


@RestController
@RequestMapping("/")
public class StudentRestController {

	@Autowired
	private StudentService studentService;
	
	
	
	@GetMapping("/students")
	public List<Student> findAll() {
		return studentService.findAll();
	}

		
	@GetMapping("/student/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
		Student theStudent = studentService.findById(studentId);
		
		if (theStudent == null) {
			throw new RuntimeException("student id not found - " + studentId);
		}
		
		return theStudent;
	}
	
	
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student theStudent) {
		
		
		theStudent.setId(0);
		
		studentService.save(theStudent);
		
		return theStudent;
	}
	
	
	@PutMapping("/student")
	@CrossOrigin
	public Student updateStudent(@RequestBody Student theStudent) {
		
		studentService.save(theStudent);
		
		return theStudent;
	}
	
	@DeleteMapping("/student/{studentId}")
	@CrossOrigin
	public String deleteStudent(@PathVariable int studentId) {
		
		Student tempStudent = studentService.findById(studentId);
		
		// throw exception if null
		
		if (tempStudent == null) {
			throw new RuntimeException("Student id not found - " + studentId);
		}
		
		studentService.deleteById(studentId);
		
		return "Deleted student id - " + studentId;
	}
	
}










