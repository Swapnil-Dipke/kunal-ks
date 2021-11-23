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



@Entity
@Table(name="Passenger_Ticket_Book")
public class PassengerTicketBook 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Passenger_Transaction_ID")
	private String passengerTransactionId;
	
	
	@ManyToOne
	@JoinColumn(name="Booking_Id")
	private BookingTable bookingTable;
	
	
	
	@ManyToOne
	@JoinColumn(name="Passenger_Id")
	private PassengerTable passengerId;
	
	@ManyToOne
	@JoinColumn(name="Seat_Table")
	private SeatTable seatTable;
	
		
		
	@ManyToOne
	@JoinColumn(name="Flight_ID")
	private String flightId;


	//---------- CONSTRUCTOR ------------------------------

	public PassengerTicketBook(String passengerTransactionId, BookingTable bookingTable, PassengerTable passengerId,
			SeatTable seatTable, String flightId) {
		super();
		this.passengerTransactionId = passengerTransactionId;
		this.bookingTable = bookingTable;
		this.passengerId = passengerId;
		this.seatTable = seatTable;
		this.flightId = flightId;
	}

	



	

	//--------- GETTER AND SETTER METHOD --------------------


	public String getPassengerTransactionId() {
		return passengerTransactionId;
	}


	public void setPassengerTransactionId(String passengerTransactionId) {
		this.passengerTransactionId = passengerTransactionId;
	}


	public BookingTable getBookingTable() {
		return bookingTable;
	}


	public void setBookingTable(BookingTable bookingTable) {
		this.bookingTable = bookingTable;
	}


	public PassengerTable getPassengerId() {
		return passengerId;
	}


	public void setPassengerId(PassengerTable passengerId) {
		this.passengerId = passengerId;
	}


	public SeatTable getSeatTable() {
		return seatTable;
	}


	public void setSeatTable(SeatTable seatTable) {
		this.seatTable = seatTable;
	}


	public String getFlightId() {
		return flightId;
	}


	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}


	
	
	
	
	
	
	
	
	



	
	

	
	
	

	
	


	
	
	
	
}
