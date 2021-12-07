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
	private int passengerTransactionId;
	

	@ManyToOne
	@JoinColumn(name="Passenger_Id")
	private Passenger passenger;


	@ManyToOne
	@JoinColumn(name="Booking")
	private Booking booking;	
	
	@ManyToOne
	@JoinColumn(name="Seat")
	private Seat seat;
	
	
	@ManyToOne
	@JoinColumn(name="Flight_Id")
	private Flight flight;


	//------------- GETTER AND SETTER METHOD -------------------------
	
	public int getPassengerTransactionId() {
		return passengerTransactionId;
	}


	public void setPassengerTransactionId(int passengerTransactionId) {
		this.passengerTransactionId = passengerTransactionId;
	}


	public Passenger getPassenger() {
		return passenger;
	}


	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}


	public Booking getBooking() {
		return booking;
	}


	public void setBooking(Booking booking) {
		this.booking = booking;
	}


	public Seat getSeat() {
		return seat;
	}


	public void setSeat(Seat seat) {
		this.seat = seat;
	}


	public Flight getFlight() {
		return flight;
	}


	public void setFlight(Flight flight) {
		this.flight = flight;
	}


	
	//-------------- TO STRING ----------------------------------
	
	@Override
	public String toString() {
		return "PassengerTicketBook [passengerTransactionId=" + passengerTransactionId + ", passenger=" + passenger
				+ ", booking=" + booking + ", seat=" + seat + ", flight=" + flight + "]";
	}

	

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
