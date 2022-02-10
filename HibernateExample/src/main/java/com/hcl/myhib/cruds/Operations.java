package com.hcl.myhib.cruds;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class Operations {
	public void insertEntity() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter First name of the student you want to insert:");
		String a = scanner.nextLine();
		System.out.println("Please enter last name of the student you want to insert:");
		String b = scanner.nextLine();
		System.out.println("Please enter email of the student  you want to insert:");
		String c = scanner.nextLine();
		

		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		student student = new student(a, b, c);
		entityManager.persist(student);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void findEntity() {
		System.out.println("Please enter in the Id of the Student you are wanting to find");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		student student = entityManager.find(student.class, a);
		System.out.println("student id :: " + student.getId());
		System.out.println("student firstname :: " + student.getFirstName());
		System.out.println("student lastname :: " + student.getLastName());
		System.out.println("student email :: " + student.getEmail());
		
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	
	public void findEntityAll() {
		
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        
        
     
		try {
			Query q = entityManager.createQuery("select s from student s");
			List<student> allStudent = new ArrayList<>();
			allStudent = q.getResultList();
			allStudent.forEach(p -> System.out.println(p));
			}
		catch (Exception e) {
			System.out.println("\nDone displaying list or it is empty or it is missing index 1\n");
		}
		entityManager.close();

	}

	public void updateEntity() {
		System.out.println("Please enter in the Id of the Student you are wanting update the email for:");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();

		student student = entityManager.find(student.class, a);
		System.out.println("student id :: " + student.getId());
		System.out.println("student firstname :: " + student.getFirstName());
		System.out.println("student lastname :: " + student.getLastName());
		System.out.println("student email :: " + student.getEmail());
		student.setEmail("christcrom988@gmail.com");
		
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void removeEntity() {
		System.out.println("Please enter id of the student you want to remove");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		
		student student = entityManager.find(student.class, a);
		System.out.println("student id :: " + student.getId());
		System.out.println("student firstname :: " + student.getFirstName());
		System.out.println("student lastname :: " + student.getLastName());
		System.out.println("student email :: " + student.getEmail());
		entityManager.remove(student);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void findEmail() {
		System.out.println("Please enter in the Id of the Student you are wanting update the email for:");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();

		student student = entityManager.find(student.class, a);
		System.out.println("Email of Student with Id " + a + ": " + student.getEmail());
	}
}
