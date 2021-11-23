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
@Table(name="Booking_Table")
public class BookingTable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Booking_Id")
	private String bookingId;
	
	@Column(name="Economy_Seats_Booked")
	private int economySeatsBooked;
	
	@Column(name="business_Seats_Booked")
	private int businessSeatsBooked;
	
	@Column(name="Booking_Date")
	private LocalDate bookingDate;
	
	@Column(name="Booking_Status")
	private String bookingStatus;
	
	@Column(name="Journey_Type")
	private String JourneyType;
	
	@Column(name="return_id")
	private String return_Id;
	
	@Column(name="total_Cost")
	private int totalCost;
	
	@Column(name="Transaction_ID")
	private int transactionId;
	
	
	
	@Column(name="Flight_Id")
	private int flightId;

	
	@ManyToOne
	@JoinColumn(name="User_Id") 
	private UserTable userTable;
	
	

	@ManyToOne
	@JoinColumn(name="Flight_Id") 
	private FlightTable flightTable;
	

	
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "bookingTable")
	private Set<PassengerTicketBook> passengerTicketBookSet = new HashSet<PassengerTicketBook>();

	
//
//	@OneToOne
//	@JoinColumn(name="Cancellation_ID") 
//	private CancellationTable cancellationTable;
//	

	
	@OneToOne
	@JoinColumn(name="Cancellation_ID")
	private CancellationTable cancellationTable;
	
	

	@OneToOne
	@JoinColumn(name="Transaction_Id") 
	private TransactionTable transactionTable;


	
//	--- CONSTRUCTOR  -----------------------
	public BookingTable(String bookingId, int economySeatsBooked, int businessSeatsBooked, LocalDate bookingDate,
			String bookingStatus, String journeyType, String return_Id, int totalCost, int transactionId, int flightId,
			UserTable userTable, FlightTable flightTable, Set<PassengerTicketBook> passengerTicketBookSet,
			CancellationTable cancellationTable, TransactionTable transactionTable) {
		super();
		this.bookingId = bookingId;
		this.economySeatsBooked = economySeatsBooked;
		this.businessSeatsBooked = businessSeatsBooked;
		this.bookingDate = bookingDate;
		this.bookingStatus = bookingStatus;
		JourneyType = journeyType;
		this.return_Id = return_Id;
		this.totalCost = totalCost;
		this.transactionId = transactionId;
		this.flightId = flightId;
		this.userTable = userTable;
		this.flightTable = flightTable;
		this.passengerTicketBookSet = passengerTicketBookSet;
		this.cancellationTable = cancellationTable;
		this.transactionTable = transactionTable;
	}





	//--------------- GETTER AND SETTER ----------------------------


	public String getBookingId() {
		return bookingId;
	}



	public void setBookingId(String bookingId) {
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



	public String getReturn_Id() {
		return return_Id;
	}



	public void setReturn_Id(String return_Id) {
		this.return_Id = return_Id;
	}



	public int getTotalCost() {
		return totalCost;
	}



	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}



	public int getTransactionId() {
		return transactionId;
	}



	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}



	public int getFlightId() {
		return flightId;
	}



	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}



	public UserTable getUserTable() {
		return userTable;
	}



	public void setUserTable(UserTable userTable) {
		this.userTable = userTable;
	}



	public FlightTable getFlightTable() {
		return flightTable;
	}



	public void setFlightTable(FlightTable flightTable) {
		this.flightTable = flightTable;
	}



	public Set<PassengerTicketBook> getPassengerTicketBookSet() {
		return passengerTicketBookSet;
	}



	public void setPassengerTicketBookSet(Set<PassengerTicketBook> passengerTicketBookSet) {
		this.passengerTicketBookSet = passengerTicketBookSet;
	}



	public CancellationTable getCancellationTable() {
		return cancellationTable;
	}



	public void setCancellationTable(CancellationTable cancellationTable) {
		this.cancellationTable = cancellationTable;
	}



	public TransactionTable getTransactionTable() {
		return transactionTable;
	}



	public void setTransactionTable(TransactionTable transactionTable) {
		this.transactionTable = transactionTable;
	}



	
	
	


	
	
	
}
