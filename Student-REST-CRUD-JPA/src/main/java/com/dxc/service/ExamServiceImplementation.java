package com.dxc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dxc.dao.ExamRepository;
import com.dxc.model.Exam;

@Service
public class ExamServiceImplementation implements ExamService {

	public ExamServiceImplementation() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private ExamRepository examRepository;
	
	@Override
	@Transactional
	public List<Exam> findAll() {
		return examRepository.findAll();	}

	@Override
	@Transactional
	public void save(Exam theExam) {
		
		examRepository.save(theExam);
	}

	@Override
	@Transactional
	public Exam findById(int id) {
		Optional<Exam> result = examRepository.findById(id);
		
		Exam theExam = null;
		
		if (result.isPresent()) {
			theExam = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find Exam id - " + id);
		}
		
		return theExam;
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		examRepository.deleteById(id);
	}

	
}