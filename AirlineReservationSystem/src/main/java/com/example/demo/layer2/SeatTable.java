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
@Table(name="Seat_Table")
public class SeatTable {

@Id
@Column(name="Seat_Number")
private String seatNumber;



@Column(name="Seat_Type")
private String seatType;


@OneToMany(cascade = CascadeType.ALL, /*fetch = FetchType.EAGER,*/ mappedBy = "seatTable") 
private Set<PassengerTicketBook> passengerTicketBookSet = new HashSet<PassengerTicketBook>();



//------------ CONSTRUCTOR ------------------------

public SeatTable(String seatNumber, String seatType, Set<PassengerTicketBook> passengerTicketBookSet) {
	super();
	this.seatNumber = seatNumber;
	this.seatType = seatType;
	this.passengerTicketBookSet = passengerTicketBookSet;
}





//------------- GETTER AND SETTER METHOD -------------------





public String getSeatNumber() {
	return seatNumber;
}



public void setSeatNumber(String seatNumber) {
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











	
	
}
