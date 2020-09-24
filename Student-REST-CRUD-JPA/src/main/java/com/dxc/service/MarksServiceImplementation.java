package com.dxc.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dxc.dao.MarksRepository;

import com.dxc.model.Marks;

@Service
public class MarksServiceImplementation implements MarksService {

	public MarksServiceImplementation() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private MarksRepository marksRepository;
	
	
	//private Student std;
	
	@Override
	@Transactional
	public List<Marks> findAll() {
		return marksRepository.findAll();	}

	@Override
	@Transactional
	public void save(Marks theMarks) {
		
		marksRepository.save(theMarks);
	}

	@Override
	@Transactional
	public List<Marks> findByStudentId(int studentId) {
		List<Marks> theMarks = marksRepository.findByStudentId(studentId);
	//	String name = Student
		return theMarks;
	}
	
	@Override
	@Transactional
	public List<Marks> findByExamId(int examId) {
		List<Marks> theMarks = marksRepository.findByExamId(examId);
	//	String name = Student
		return theMarks;
	}

//	@Override
//	@Transactional
//	public void deleteById(int id) {
//		// TODO Auto-generated method stub
//		marksRepository.deleteById(id);
//	}

	@Override
	public Marks findById(int student_id, int exam_id) {
		
		Marks theMarks = marksRepository.findById(student_id, exam_id);
		return theMarks;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	
}