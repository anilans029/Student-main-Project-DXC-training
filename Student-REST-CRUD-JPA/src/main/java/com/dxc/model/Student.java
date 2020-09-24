package com.dxc.model;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "student")
public class Student{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	@Column(name ="name")
	String name;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name ="dob")
	@JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy", timezone = "UTC")
	Date dob;
	@Column(name ="email")
	String email;
	@Column(name ="mobile")
	String mobile;
	
	
	

	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name,String strDob, String email, String mobile) throws ParseException {
		super();
		this.name = name;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		dob = sdf.parse(strDob);
		this.email = email;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public Date getDob() {
		return dob;
	}

	

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	

	
//	public List<Marks> getMarks() {
//		return marks;
//	}
//
//	public void setMarks(List<Marks> marks) {
//		this.marks = marks;
//	}

	@Override
	public String toString() {
		String strDob = new SimpleDateFormat("dd-MM-yyyy").format(dob);
		return "Student [id=" + id + ", name=" + name + "dob"+ strDob +", email=" + email + ", mobile=" + mobile
				+ "]";
	}

	
	
	
	

}
