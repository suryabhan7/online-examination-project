package com.example.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import com.example.demo.layer2.StudentTable;


public class OnlineExamCRUDTest {
	
	
	@Test
	public void insertStudentTable() {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("MyJPA"); 
		
		System.out.println("Entity Manager Factory : "+entityManagerFactory);
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		
		System.out.println("Entity Manager : "+entityManager);
		
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
			StudentTable stutable = new StudentTable(); 
			stutable.setFullName(" prat");
			stutable.setEmail("kane@1");
			stutable.setPhoneNumber(795354531);
			stutable.setDob(25/5/67);
			stutable.setQualification("ech");
			stutable.setYearOfQualification(2013);
			stutable.setLocID(109);
			//stutable.setUserid("fsdfg");
		
			
			entityManager.persist(stutable); 
		transaction.commit();
	}
	

}
