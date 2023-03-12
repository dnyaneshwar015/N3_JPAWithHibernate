package org.tnsif.tableperclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TablePerClassDemo {

	public static void main(String args[])
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//first emp
		Employee1 e3 = new Employee1();
		e3.setId(161);
		e3.setName("Shruti Salve");
		e3.setSalary(35000.10f);
		em.persist(e3);
		
		//Second emp
		Employee1 e4 = new Employee1();
		e4.setId(161);
		e4.setName("Aishwarya Salve");
		e4.setSalary(45000.50f);
		em.persist(e4);
		
		Manager1 m1=new Manager1();
		m1.setId(602);
		m1.setName("Miraj Salve");
		m1.setSalary(52000.45f);
		m1.setDeptid(45);
		m1.setDeptname("Finance");
		em.persist(m1);
		em.getTransaction().commit();
		
		System.out.println("Data added successfully");
		em.close();
		
		factory.close();	
	}
}
