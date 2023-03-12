package org.tnsif.entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table; 

//Below annotation ensure that given class is entity
//entity
@Entity
@Table(name="student")
public class Student implements Serializable {

	private static final long serialVersionUID = 1L; 
	
	//Below annotation ensure that rollno is primary key
	@Id 
	//it is a private data member
	private int rollno; 
	private String stdname;
	
	//getter and setter method
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	
	
	
}
