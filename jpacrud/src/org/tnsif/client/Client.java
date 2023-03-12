package org.tnsif.client;

import java.util.Scanner;

import org.tnsif.entities.Student;
import org.tnsif.service.StudentService;
import org.tnsif.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		StudentService service =  new StudentServiceImpl();
		Scanner sc=new Scanner(System.in);
		Student s1=new Student();
		System.out.println("Enter the Rollno and name");
		s1.setRollno(sc.nextInt());
		s1.setStdname(sc.nextLine());
		service.add(s1);
		
	System.out.println("Student Added successfully");
	}
	
}
