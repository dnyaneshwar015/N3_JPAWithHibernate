package org.tnsif.dao;

import org.tnsif.entities.Student;

public interface StudentDao {

	
	void addStudent (Student student);//Creation
	Student getStudent (int rollno);//Retrieve
	void updateStudent (Student sudent);//Update 
	void removeStudent(Student student);//Delete
	
	void beginTransaction();
	void commitTransaction();
}
