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




//-------------------------- POJO flgiht table-------------------
@Entity
@Table(name="Flight_Table")
public class FlightTable {
     
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
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "flightTable") //one fligt  has Many passenger ticket book
	private Set<PassengerTicketBook> ticketBookSet = new HashSet<PassengerTicketBook>();

	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "userTable") //one fligt  has Many passenger ticket book
	private Set<BookingTable> bookingTableSet = new HashSet<BookingTable>();


	
	
	//----------------- CONSTRUCTOR ------------------
	

	public FlightTable(int flightId, String flightName, String destinationLocation, LocalDateTime departureTime,
			LocalDateTime arrivalDateTime, float economyClassPrice, float buissnessClassPrice, int totalEconomySeats,
			int totalBUissnessSeats, int availableEconomySeats, int availableBuissnessSeats,
			Set<PassengerTicketBook> ticketBookSet, Set<BookingTable> bookingTableSet) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.destinationLocation = destinationLocation;
		this.departureTime = departureTime;
		this.arrivalDateTime = arrivalDateTime;
		this.economyClassPrice = economyClassPrice;
		this.buissnessClassPrice = buissnessClassPrice;
		this.totalEconomySeats = totalEconomySeats;
		this.totalBUissnessSeats = totalBUissnessSeats;
		this.availableEconomySeats = availableEconomySeats;
		this.availableBuissnessSeats = availableBuissnessSeats;
		this.ticketBookSet = ticketBookSet;
		this.bookingTableSet = bookingTableSet;
	}




	//------------- GETTER AND SETTER METHOD --------------------------
	




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




	public Set<PassengerTicketBook> getTicketBookSet() {
		return ticketBookSet;
	}




	public void setTicketBookSet(Set<PassengerTicketBook> ticketBookSet) {
		this.ticketBookSet = ticketBookSet;
	}




	public Set<BookingTable> getBookingTableSet() {
		return bookingTableSet;
	}




	public void setBookingTableSet(Set<BookingTable> bookingTableSet) {
		this.bookingTableSet = bookingTableSet;
	}

	
	
	


		
	
	
	
}
