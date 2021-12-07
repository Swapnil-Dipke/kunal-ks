package com.example.demo.layer2;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Seat")
public class Seat {

@Id
@Column(name="Seat_Number")
private int seatNumber;


@Column(name="Seat_Type")
private String seatType;



@OneToMany(cascade = CascadeType.ALL, /*fetch = FetchType.EAGER,*/ mappedBy = "seat") 
private Set<PassengerTicketBook> passengerTicketBookSet = new HashSet<PassengerTicketBook>();

//---------------- GETTER AND SETTER METHOD -------------------

public int getSeatNumber() {
	return seatNumber;
}



public void setSeatNumber(int seatNumber) {
	this.seatNumber = seatNumber;
}



public String getSeatType() {
	return seatType;
}



public void setSeatType(String seatType) {
	this.seatType = seatType;
}



public Set<PassengerTicketBook> getPassengerTicketBookSet() {
	return passengerTicketBookSet;
}



public void setPassengerTicketBookSet(Set<PassengerTicketBook> passengerTicketBookSet) {
	this.passengerTicketBookSet = passengerTicketBookSet;
}


//----------------------- TO STRING ---------------------------
@Override
public String toString() {
	return "Seat [seatNumber=" + seatNumber + ", seatType=" + seatType + ", passengerTicketBookSet="
			+ passengerTicketBookSet + "]";
}




















}