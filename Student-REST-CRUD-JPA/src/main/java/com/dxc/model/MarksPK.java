package com.dxc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MarksPK implements Serializable{
	
	private static final long serialVersionUID = 1L;


	@Column(name="exam_id")
	     int exam_id;

	  
	    @Column(name="student_id")
	     int student_id;
	    
	    


		public MarksPK() {
			super();
			
		}


		public MarksPK(int exam_id, int student_id) {
			super();
			this.exam_id = exam_id;
			this.student_id = student_id;
		}


		public int getExam_id() {
			return exam_id;
		}


		public void setExam_id(int exam_id) {
			this.exam_id = exam_id;
		}


		public int getStudent_id() {
			return student_id;
		}


		public void setStudent_id(int student_id) {
			this.student_id = student_id;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + exam_id;
			result = prime * result + student_id;
			return result;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			MarksPK other = (MarksPK) obj;
			if (exam_id != other.exam_id)
				return false;
			if (student_id != other.student_id)
				return false;
			return true;
		}
	    
		
		
}
