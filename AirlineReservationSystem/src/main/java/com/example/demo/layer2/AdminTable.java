package com.example.demo.layer2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//--------------------POJO FOR ADMIN TABLE --------------------------
@Entity
@Table(name="Admin_Table")
public class AdminTable {

	@Id
	@Column(name="Admin_Id")
	private String adminId;
	
	@Column(name="Admin_Password")
	private String adminPassword;
	
	//-------------- GETTER AND SETTER METHOD ---------------------------------


	
	
	
}
