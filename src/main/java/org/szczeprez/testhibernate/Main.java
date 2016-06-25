package org.szczeprez.testhibernate;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.szczeprez.testhibernate.domain.Employee;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

/*		Employee employee = new Employee();
		employee.setFirstName("Jan");
		employee.setLastName("Kowalski");
		employee.setSalary(3333.333);
		employee.setSalary2(new BigDecimal("12345.3"));
		
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();*/

		entityManager.close();
		entityManagerFactory.close();

	}
}
