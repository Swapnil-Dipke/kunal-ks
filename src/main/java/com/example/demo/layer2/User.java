package com.example.demo.layer2;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


	
	

@Entity
@Table(name="User")
public class User {
	
	
	//-------------------- POJO ------------------------
	@Id
	@Column(name="User_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String userId;
	
    @Column(name="First_Name")
	private String firstname;
	
    @Column(name="Last_Name")
	private String lastName;
	
    @Column(name="Email_Id")
	private String emailId;
	
    @Column(name="Password")
	private String password;
	
    @Column(name="Date_Of_Birth")
	private LocalDateTime dateOfBirth;
	
    @Column(name="Phone_Number")
	private int phoneNumber;
    

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user") 
	private Set<Booking> bookingSet = new HashSet<Booking>();
    

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user") //one Department has Many Employees
	private Set<Passenger> passengerSet = new HashSet<Passenger>();


    
    //----------- GETTER AND SETTER METHOD -----------------------
    
	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(LocalDateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public int getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public Set<Booking> getBookingSet() {
		return bookingSet;
	}


	public void setBookingSet(Set<Booking> bookingSet) {
		this.bookingSet = bookingSet;
	}


	public Set<Passenger> getPassengerSet() {
		return passengerSet;
	}


	public void setPassengerSet(Set<Passenger> passengerSet) {
		this.passengerSet = passengerSet;
	}


	
	//------------------- TO STRING ----------------------------------
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstname=" + firstname + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", password=" + password + ", dateOfBirth=" + dateOfBirth + ", phoneNumber=" + phoneNumber
				+ ", bookingSet=" + bookingSet + ", passengerSet=" + passengerSet + "]";
	}


    
       
    
    
    
    
    
    
    
}
