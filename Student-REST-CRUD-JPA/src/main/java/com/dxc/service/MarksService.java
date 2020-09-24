package com.dxc.service;

import java.util.List;


import com.dxc.model.Marks;


public interface MarksService {

	public List<Marks> findAll();

	public void save(Marks theMarks);

	public List<Marks> findByStudentId(int studentId);
	
	public List<Marks> findByExamId(int examId);
	
	public Marks findById(int student_id, int exam_id);

	public void deleteById(int id);
	
}
