package org.szczeprez.testhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.szczeprez.testhibernate.domain.Employee;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase"); 
		EntityManager entityManager = entityManagerFactory.createEntityManager(); 
		
		Employee employee = new Employee(); 
		employee.setFirstName("Jan");
		employee.setLastName("Kowalski");
		employee.setSalary(3333.333);
		
		Employee employee2 = new Employee(); 
		employee2.setFirstName("Micha³");
		employee2.setLastName("Nowak");
		employee2.setSalary(2222.22);
		
		
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.persist(employee2);
		entityManager.getTransaction().commit();
		
		
		entityManager.close();
		entityManagerFactory.close();

	}

}
