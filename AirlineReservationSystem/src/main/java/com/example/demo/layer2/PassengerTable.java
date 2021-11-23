package com.example.demo.layer2;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


//----------- POJO FOR PASSENGER TABLE ---------------

@Entity
@Table(name="Passenger_Table")
public class PassengerTable {
	
	@Id
	@Column (name="Passenger_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String passengerId;
	
	@Column(name="First_Name")
	private String firstName;
	
	@Column(name="Last_Name")
	private String lastName;
	
	@Column(name="Gender")
	private char gender;
	
	

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "passengerId") 
	private Set<PassengerTicketBook> passengerTicketBookSet = new HashSet<PassengerTicketBook>();

	
	@ManyToOne
	@JoinColumn(name="User_Id") 
	private UserTable userTable;


	//------ CONSTRUCTOR --------------------
	
	public PassengerTable(String passengerId, String firstName, String lastName, char gender,
			Set<PassengerTicketBook> passengerTicketBookSet, UserTable userTable) {
		super();
		this.passengerId = passengerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.passengerTicketBookSet = passengerTicketBookSet;
		this.userTable = userTable;
	}


	
	
	
	
	//----------------------- GETTER AND SETTER METHOD ------------------
	

	
	public String getPassengerId() {
		return passengerId;
	}


	public void setPassengerId(String passengerId) {
		this.passengerId = passengerId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public Set<PassengerTicketBook> getPassengerTicketBookSet() {
		return passengerTicketBookSet;
	}


	public void setPassengerTicketBookSet(Set<PassengerTicketBook> passengerTicketBookSet) {
		this.passengerTicketBookSet = passengerTicketBookSet;
	}


	public UserTable getUserTable() {
		return userTable;
	}


	public void setUserTable(UserTable userTable) {
		this.userTable = userTable;
	}


	

	
	
	
	
	

	
	

	
	

}
