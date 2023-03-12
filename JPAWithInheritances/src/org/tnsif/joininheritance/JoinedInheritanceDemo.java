package org.tnsif.joininheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JoinedInheritanceDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();

		em.getTransaction().begin();

		//first student
		Student47 e3=new Student47();
		e3.setRollno(1001);
		e3.setName("Dnyaneshwar");
		e3.setPercentage(85.90f);
		em.persist(e3);

		//second student
		Student47 e4=new Student47();
		e4.setRollno(1002);
		e4.setName("Rudra Bhalerao");
		e4.setPercentage(81.90f);
		em.persist(e4);

		//first citizen
		Citizen m1=new Citizen();
		m1.setRollno(1500);
		m1.setName("sachin");
		m1.setPercentage(76.56f);
		m1.setCitizenType("India");
		m1.setPassportno(1657687);
		em.persist(m1);
		em.getTransaction().commit();

		System.out.println("Data added successfully");
		em.close();

		factory.close();

	}

}
