package com.dxc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dxc.model.Exam;

public interface ExamRepository extends JpaRepository<Exam, Integer> {

}
