package org.szczeprez.testhibernate;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.szczeprez.testhibernate.domain.Employee;
import org.szczeprez.testhibernate.domain1.Employee1;
import org.szczeprez.testhibernate.domain1.Employee2;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Employee2 employee2 = new Employee2(); 
		
/*		Employee1 employee = new Employee1();
		employee.setFirstName("Jan");
		employee.setLastName("Kowalski");
		employee.setSalary(3333.333);
		employee.setLocality("Warszawa");
		employee.setZipCode("11-111");
		employee.setStreet("Koszykowa"); 
		employee.setStreetNumber(111);*/
 
		
		entityManager.getTransaction().begin();
		entityManager.persist(employee2);
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();

	}
}
