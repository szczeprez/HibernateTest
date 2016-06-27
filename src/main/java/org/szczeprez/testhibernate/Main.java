package org.szczeprez.testhibernate;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.szczeprez.testhibernate.domain.Employee;
import org.szczeprez.testhibernate.domain1.Employee1;
import org.szczeprez.testhibernate.domain1.Employee2;
import org.szczeprez.testhibernate.domain1.Employee3;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		
		
		
		Employee3 employee3 = new Employee3();
		employee3.setFirstName("Jan");
		employee3.setLastName("Nowak"); 
		employee3.setSalary(1000.00);
		
		
	    entityManager.getTransaction().begin();
		entityManager.persist(employee3);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
		
		/*		Employee2 employee2 = new Employee2(); 
		
		Employee1 employee = new Employee1();
		employee.setFirstName("Jan");
		employee.setLastName("Kowalski");
		employee.setSalary(3333.333);
		employee.setLocality("Warszawa");
		employee.setZipCode("11-111");
		employee.setStreet("Koszykowa"); 
		employee.setStreetNumber(111);*/
 


	}
}
