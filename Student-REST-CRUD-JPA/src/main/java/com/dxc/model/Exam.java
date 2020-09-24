package com.dxc.model;

//import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name="exam")
public class Exam {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name= "exam_name")
	private String exam_name;
	
//	 @OneToMany(mappedBy = "exam_id")
//	    private List<Marks> marks;

	
	
	
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Exam(String exam_name) {
		super();
		
		this.exam_name = exam_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getExam_name() {
		return exam_name;
	}
	public void setExam_name(String exam_name) {
		this.exam_name = exam_name;
	}
	
	
	
	
//	public List<Marks> getMarks() {
//		return marks;
//	}
//	public void setMarks(List<Marks> marks) {
//		this.marks = marks;
//	}
	@Override
	public String toString() {
		return "Exam [id=" + id + ", exam_name=" + exam_name + "]";
	}
	
	
}
