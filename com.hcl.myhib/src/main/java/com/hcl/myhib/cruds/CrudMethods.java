package com.hcl.myhib.cruds;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CrudMethods {
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
		int i =1;
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		
       
		student student = entityManager.find(student.class, i);
		while(student != null) {
			student=entityManager.find(student.class, i);
			entityManager.getTransaction().begin();
		System.out.println("student id :: " + student.getId());
		System.out.println("student firstname :: " + student.getFirstName());
		System.out.println("student lastname :: " + student.getLastName());
		System.out.println("student email :: " + student.getEmail());
		entityManager.getTransaction().commit();
		i++;
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
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();

		student student = entityManager.find(student.class, 1);
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
		System.out.println("Email of Student with Id " + a +": "+ student.getEmail());
		
		
	}
	}
