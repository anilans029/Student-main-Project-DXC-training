package com.dxc.service;

import java.util.List;

import com.dxc.model.Exam;

public interface ExamService {

	public List<Exam> findAll();

	public void save(Exam theExam);

	public Exam findById(int id);

	public void deleteById(int id);
	
}
