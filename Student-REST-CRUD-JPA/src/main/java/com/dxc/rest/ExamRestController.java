package com.dxc.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.model.Exam;

import com.dxc.service.ExamService;


@RestController
@RequestMapping("/")
public class ExamRestController {

	@Autowired
	private ExamService examService;
	
	
	
	@GetMapping("/exams")
	public List<Exam> findAll() {
		return examService.findAll();
	}

		
	@GetMapping("/exam/{examId}")
	public Exam getExam(@PathVariable int examId) {
		
		Exam theExam = examService.findById(examId);
		
		if (theExam == null) {
			throw new RuntimeException("Exam id not found - " + examId);
		}
		
		return theExam;
	}
	
	
	
	@PostMapping("/exam")
	public Exam addStudent(@RequestBody Exam theExam) {
		
		
		theExam.setId(0);
		
		examService.save(theExam);
		
		return theExam;
	}
	
	
	@PutMapping("/exam")
	public Exam updateExam(@RequestBody Exam theExam) {
		
		examService.save(theExam);
		
		return theExam;
	}
	
	@DeleteMapping("/exam/{ExamId}")
	public String deleteExam(@PathVariable int ExamId) {
		
		Exam tempExam = examService.findById(ExamId);
		
		// throw exception if null
		
		if (tempExam == null) {
			throw new RuntimeException("Exam id not found - " + ExamId);
		}
		
		examService.deleteById(ExamId);
		
		return "Deleted Exam id - " + ExamId;
	}
	
}










