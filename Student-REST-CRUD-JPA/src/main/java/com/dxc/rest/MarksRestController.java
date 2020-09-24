package com.dxc.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.model.Marks;
import com.dxc.service.MarksService;


@RestController
@RequestMapping("/")
public class MarksRestController {

	@Autowired
	private MarksService marksService;
	
	
	
	@GetMapping("/marks")
	public List<Marks> findAll() {
		return marksService.findAll();
	}

		
	@GetMapping("/marks/{studentId}")
	public List<Marks> getMarksByStudentId(@PathVariable int studentId) {
		
		List<Marks> theMarks = marksService.findByStudentId(studentId);
		
		if (theMarks == null) {
			throw new RuntimeException("Marks id not found - " + studentId);
		}
		
		return theMarks;
	}
	
	@GetMapping("/mark/{examId}")
	public List<Marks> getMarksByExamId(@PathVariable int examId) {
		
		List<Marks> theMarks = marksService.findByExamId(examId);
		
		if (theMarks == null) {
			throw new RuntimeException("Marks id not found - " + examId);
		}
		
		return theMarks;
	}
	
	@GetMapping("/marks/{studentId}/{examId}")
	public Marks getMarks(@PathVariable int studentId, @PathVariable int examId) {
		
		Marks theMarks = marksService.findById(studentId,examId);
		
		if (theMarks == null) {
			throw new RuntimeException("Marks id not found - " + studentId);
		}
		
		return theMarks;
	}
	
	
	
	@PostMapping("/marks")
	public Marks addMarks(@RequestBody Marks theMarks) {
		marksService.save(theMarks);
		
		return theMarks;
	}
	
	
	@CrossOrigin
	@PutMapping("/marks")
	public Marks updateMarks(@RequestBody Marks theMarks) {
		
		marksService.save(theMarks);
		
		return theMarks;
	}
	
	
	
}










