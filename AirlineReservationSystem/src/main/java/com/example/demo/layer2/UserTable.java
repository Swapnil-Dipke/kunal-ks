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

//-----------------POJO FOR USER TABLE ---------------------------

@Entity
@Table(name="UserTable")
public class UserTable {
	
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
    
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "userTable") 
	private Set<BookingTable> bookingTableSet = new HashSet<BookingTable>();
    
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "PassengerTable") //one Department has Many Employees
	private Set<PassengerTable> passengerTableSet = new HashSet<PassengerTable>();


    
    //----------- constructor -------------------
   


	public String getUserId() {
		return userId;
	}



	public UserTable(String userId, String firstname, String lastName, String emailId, String password,
			LocalDateTime dateOfBirth, int phoneNumber, Set<BookingTable> bookingTableSet,
			Set<PassengerTable> passengerTableSet) {
		super();
		this.userId = userId;
		this.firstname = firstname;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
		this.bookingTableSet = bookingTableSet;
		this.passengerTableSet = passengerTableSet;
	}


	
	 //------------------ GETTER AND SETTER METHOD ------------------
	   
	

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



	public Set<BookingTable> getBookingTableSet() {
		return bookingTableSet;
	}



	public void setBookingTableSet(Set<BookingTable> bookingTableSet) {
		this.bookingTableSet = bookingTableSet;
	}



	public Set<PassengerTable> getPassengerTableSet() {
		return passengerTableSet;
	}



	public void setPassengerTableSet(Set<PassengerTable> passengerTableSet) {
		this.passengerTableSet = passengerTableSet;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}
	
    
   
	

    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
}