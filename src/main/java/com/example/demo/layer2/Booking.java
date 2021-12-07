package com.example.demo.layer2;

import java.time.LocalDate;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Booking")
public class Booking {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Booking_Id")
	private int bookingId;
	
	
	private int economySeatsBooked;
	
	
	private int businessSeatsBooked;
	
	
	private LocalDate bookingDate;
	
	
	private String bookingStatus;
	
	
	private String JourneyType;
	
	
	private int totalCost;
	


	@OneToOne
	@JoinColumn(name="Transaction_Id")
	private Transaction transaction;


	@OneToOne
	@JoinColumn(name="Cancellation")
	private Cancellation cancellation;


	@ManyToOne
	@JoinColumn(name="Flight_Id") 
	private Flight flight;
	

	@ManyToOne
	@JoinColumn(name="User_Id") 
	private User user;
	
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "booking")
	private Set<PassengerTicketBook> passengerTicketBookSet = new HashSet<PassengerTicketBook>();


	
	//------------ GETTER AND SETTER METHOD -------------------
	
	public int getBookingId() {
		return bookingId;
	}


	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}


	public int getEconomySeatsBooked() {
		return economySeatsBooked;
	}


	public void setEconomySeatsBooked(int economySeatsBooked) {
		this.economySeatsBooked = economySeatsBooked;
	}


	public int getBusinessSeatsBooked() {
		return businessSeatsBooked;
	}


	public void setBusinessSeatsBooked(int businessSeatsBooked) {
		this.businessSeatsBooked = businessSeatsBooked;
	}


	public LocalDate getBookingDate() {
		return bookingDate;
	}


	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}


	public String getBookingStatus() {
		return bookingStatus;
	}


	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}


	public String getJourneyType() {
		return JourneyType;
	}


	public void setJourneyType(String journeyType) {
		JourneyType = journeyType;
	}


	public int getTotalCost() {
		return totalCost;
	}


	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}


	public Transaction getTransaction() {
		return transaction;
	}


	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}


	public Cancellation getCancellation() {
		return cancellation;
	}


	public void setCancellation(Cancellation cancellation) {
		this.cancellation = cancellation;
	}


	public Flight getFlight() {
		return flight;
	}


	public void setFlight(Flight flight) {
		this.flight = flight;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Set<PassengerTicketBook> getPassengerTicketBookSet() {
		return passengerTicketBookSet;
	}


	public void setPassengerTicketBookSet(Set<PassengerTicketBook> passengerTicketBookSet) {
		this.passengerTicketBookSet = passengerTicketBookSet;
	}


	//-----------------TO STRING -------------------------------
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", economySeatsBooked=" + economySeatsBooked
				+ ", businessSeatsBooked=" + businessSeatsBooked + ", bookingDate=" + bookingDate + ", bookingStatus="
				+ bookingStatus + ", JourneyType=" + JourneyType + ", totalCost=" + totalCost + ", transaction="
				+ transaction + ", cancellation=" + cancellation + ", flight=" + flight + ", user=" + user
				+ ", passengerTicketBookSet=" + passengerTicketBookSet + "]";
	}

	
	
	
	
	

}
