package com.example.demo.layer2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Admin")
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ADMIN_ID")
	private int adminId;
	
	@Column(name = "ADMIN_PASSWARD")
	private String adminPassward;

	
	//---------------- GETTER AND SETTER METHOD ------------
	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminPassward() {
		return adminPassward;
	}

	public void setAdminPassward(String adminPassward) {
		this.adminPassward = adminPassward;
	}

	
	//----------------- to string ---------------
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminPassward=" + adminPassward + "]";
	}
	
	
	

}
