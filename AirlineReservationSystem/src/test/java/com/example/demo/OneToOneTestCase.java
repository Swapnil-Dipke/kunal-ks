package com.example.demo;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import com.example.demo.layer2.CancellationTable;
import com.example.demo.layer2.TransactionTable;  



public class OneToOneTestCase {

	
	

	
	
	@Test
	public void insertCancellationTable() {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("MyJPA");//persistence.xml is read here 
		
		System.out.println("Entity Manager Factory : "+entityManagerFactory);
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//ctrl+shift+M
		
		System.out.println("Entity Manager : "+entityManager);
		
	EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		CancellationTable cancellationTable = new CancellationTable(0, null, null, null, 0, null, null, null); //new/blank entity object 
		cancellationTable.getCancellationId();
		cancellationTable.setCancellationDate(LocalDate.of(2021, 12, 25));
		cancellationTable.setCancellationReason("due to fever");
		cancellationTable.setCancellationStatus("successfull");
		cancellationTable.setRefundAmount(200);
		cancellationTable.setTransaction_Id("PPay");
		cancellationTable.setBookingTable(null);
		cancellationTable.setTransactionTable(null);
		
			entityManager.persist(cancellationTable); //generate the insert query for us 
		transaction.commit();
	}
	
	
	
	
	/*
	
	
	
	
	
	
	@Test
	public void insertCancellationTable()        {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("MyJPA1");  //rsistence.xml is read here 

		System.out.println("Entity Manager Factory : "+entityManagerFactory);

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//ctrl+shift+M

		System.out.println("Entity Manager : "+entityManager);

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
			CancellationTable cancellationTable = new CancellationTable(0, null, null, null, 0, null, null, null); //new/blank entity object 
			cancellationTable.setCancellationReason("Some issue to cancellation ");
			cancellationTable.setCancellationDate(LocalDate.of(2021, 12, 25));
			cancellationTable.setCancellationStatus("active");
			cancellationTable.setRefundAmount(1200.0);
			

			entityManager.persist(cancellationTable); //generate the insert query for us 
		transaction.commit();
	}
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
