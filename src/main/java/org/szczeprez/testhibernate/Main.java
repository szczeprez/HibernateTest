package org.szczeprez.testhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.szczeprez.testhibernate.domain1.Employee3;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase"); 
		EntityManager entityManager = entityManagerFactory.createEntityManager(); 
		Employee3 employee3 = new Employee3();
		employee3.setFirstName("Jan");
		employee3.setLastName("Nowak");
		employee3.setSalary(1000.0);
		
		entityManager.getTransaction().begin();
		entityManager.persist(employee3);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();

	}

}
