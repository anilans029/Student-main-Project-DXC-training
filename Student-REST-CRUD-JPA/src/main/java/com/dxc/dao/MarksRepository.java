package com.dxc.dao;

import java.util.List;
//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dxc.model.Marks;
import com.dxc.model.MarksPK;

public interface MarksRepository extends JpaRepository<Marks, MarksPK> {

	//Optional<Marks> findById(int exam_id, int student_id);
	
	 @Query(value = "SELECT * FROM marks WHERE student_id = :studentId", nativeQuery = true)
	    List<Marks> findByStudentId(@Param("studentId") int studentId);
	 
	 @Query(value = "SELECT * FROM marks WHERE student_id = :studentId AND exam_id = :examId", nativeQuery = true)
	    Marks findById(@Param("studentId") int studentId, @Param("examId") int examtId);

	 @Query(value = "SELECT * FROM marks WHERE exam_id = :examId", nativeQuery = true)
	    List<Marks> findByExamId(@Param("examId") int examId);
	
}
