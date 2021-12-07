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
@Table(name="Passenger")
public class Passenger {
	
	@Id
	@Column (name="Passenger_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int passengerId;
	
	@Column(name="First_Name")
	private String firstName;
	
	@Column(name="Last_Name")
	private String lastName;
	
	@Column(name="Gender")
	private char gender;
	

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "passenger") 
	private Set<PassengerTicketBook> passengerTicketBookSet = new HashSet<PassengerTicketBook>();


	@ManyToOne
	@JoinColumn(name="User_Id") 
	private User user;


	//------------------- GETTER AND SETTER METHOD -----------------------------
	
	public int getPassengerId() {
		return passengerId;
	}


	public void setPassengerId(int passengerId) {
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


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	
	//----------- TO STRING -----------------------------------------
	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", passengerTicketBookSet=" + passengerTicketBookSet + ", user=" + user + "]";
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}