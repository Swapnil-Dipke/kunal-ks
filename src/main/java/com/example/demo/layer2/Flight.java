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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Flight")
public class Flight {
     
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Flight_Id")
	private int flightId;
	
	@Column(name="Flight_Name")
	private String flightName;
	
	@Column(name="Destination_Location")
	private String destinationLocation;
	
	@Column(name="Departure_Time")
	private LocalDateTime departureTime;
    
	@Column(name="Arrival_Date_Time")
	private LocalDateTime arrivalDateTime;
	
	@Column(name="EconomyClassPrice")
	private float economyClassPrice;
	
	@Column(name="Buissness_Class_Price")
	private float buissnessClassPrice;
	
	@Column(name="Total_Economy_Seats")
	private int totalEconomySeats;
	
	@Column(name="Total_Buissness_Seats")
	private int totalBUissnessSeats;
	
	@Column(name="Available_Economy_Seats")
	private int availableEconomySeats;
	
	@Column(name="Available_Buissness_Seats")
	private int availableBuissnessSeats;
	
	
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "flight") //one fligt  has Many passenger ticket book
	private Set<Booking> bookingSet = new HashSet<Booking>();


	@OneToMany(cascade = CascadeType.ALL, mappedBy = "flight") //one fligt  has Many passenger ticket book
	private Set<PassengerTicketBook> passengerticketBookSet = new HashSet<PassengerTicketBook>();


	
	
	//---------------- GETTER AND SETTER METHOD ------------------------
	
	public int getFlightId() {
		return flightId;
	}


	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}


	public String getFlightName() {
		return flightName;
	}


	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}


	public String getDestinationLocation() {
		return destinationLocation;
	}


	public void setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
	}


	public LocalDateTime getDepartureTime() {
		return departureTime;
	}


	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}


	public LocalDateTime getArrivalDateTime() {
		return arrivalDateTime;
	}


	public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}


	public float getEconomyClassPrice() {
		return economyClassPrice;
	}


	public void setEconomyClassPrice(float economyClassPrice) {
		this.economyClassPrice = economyClassPrice;
	}


	public float getBuissnessClassPrice() {
		return buissnessClassPrice;
	}


	public void setBuissnessClassPrice(float buissnessClassPrice) {
		this.buissnessClassPrice = buissnessClassPrice;
	}


	public int getTotalEconomySeats() {
		return totalEconomySeats;
	}


	public void setTotalEconomySeats(int totalEconomySeats) {
		this.totalEconomySeats = totalEconomySeats;
	}


	public int getTotalBUissnessSeats() {
		return totalBUissnessSeats;
	}


	public void setTotalBUissnessSeats(int totalBUissnessSeats) {
		this.totalBUissnessSeats = totalBUissnessSeats;
	}


	public int getAvailableEconomySeats() {
		return availableEconomySeats;
	}


	public void setAvailableEconomySeats(int availableEconomySeats) {
		this.availableEconomySeats = availableEconomySeats;
	}


	public int getAvailableBuissnessSeats() {
		return availableBuissnessSeats;
	}


	public void setAvailableBuissnessSeats(int availableBuissnessSeats) {
		this.availableBuissnessSeats = availableBuissnessSeats;
	}


	public Set<Booking> getBookingSet() {
		return bookingSet;
	}


	public void setBookingSet(Set<Booking> bookingSet) {
		this.bookingSet = bookingSet;
	}


	public Set<PassengerTicketBook> getPassengerticketBookSet() {
		return passengerticketBookSet;
	}


	public void setPassengerticketBookSet(Set<PassengerTicketBook> passengerticketBookSet) {
		this.passengerticketBookSet = passengerticketBookSet;
	}

	//---------------------- TO STRING -------------------
	
	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightName=" + flightName + ", destinationLocation="
				+ destinationLocation + ", departureTime=" + departureTime + ", arrivalDateTime=" + arrivalDateTime
				+ ", economyClassPrice=" + economyClassPrice + ", buissnessClassPrice=" + buissnessClassPrice
				+ ", totalEconomySeats=" + totalEconomySeats + ", totalBUissnessSeats=" + totalBUissnessSeats
				+ ", availableEconomySeats=" + availableEconomySeats + ", availableBuissnessSeats="
				+ availableBuissnessSeats + ", bookingSet=" + bookingSet + ", passengerticketBookSet="
				+ passengerticketBookSet + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
