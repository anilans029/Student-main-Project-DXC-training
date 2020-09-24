package com.dxc.model;

import javax.persistence.*;

@Entity
@Table(name = "Marks")
public class Marks	{
 
	@EmbeddedId
	MarksPK marksPK;
  

    @Column(name = "sub1")
    private int sub1;

    @Column(name = "sub2")
    private int sub2;

    @Column(name = "sub3")
    private int sub3;

	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Marks(int sub1, int sub2, int sub3) {
		super();
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}




	public Marks(MarksPK marksPK, int sub1, int sub2, int sub3) {
		super();
		this.marksPK = marksPK;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}


	public int getSub1() {
		return sub1;
	}

	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}

	public int getSub3() {
		return sub3;
	}

	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}

	public MarksPK getMarksPK() {
		return marksPK;
	}


	public void setMarksPK(MarksPK marksPK) {
		this.marksPK = marksPK;
	}
	
	


    


}
