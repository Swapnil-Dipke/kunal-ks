package com.example.demo.layer2;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


//------------------ POJO FOR TRANSACTION TABLE -----------------

@Entity
@Table(name="Transactional_Table")
public class TransactionTable {

	@Id
	@Column(name="Transaction_Id")
	private String trannsactionId;
	
	@Column(name="Transaction_Id")
	private String transactionType;
	
	@Column(name="Transaction_Mode")
	private String transactionMode;
	
	@Column(name="Transaction_Amount")
	private float transactionAmount;
	
	@Column(name="Transaction_Status")
	private String transactionStatus;

//	@OneToMany(cascade = CascadeType.ALL, /*fetch = FetchType.EAGER,*/ mappedBy = "transactionTable") //one Department has Many Employees
//	private Set<TransactionTable> transactionTableSet = new HashSet<TransactionTable>();
//	

	@OneToOne(cascade = CascadeType.ALL,mappedBy = "bookingTable")
	@JoinColumn(name="Booking_Id")
	private BookingTable bookingTable;
	
//	
//	@OneToMany(cascade = CascadeType.ALL,mappedBy = "bookingTable")
//	private Set<PassengerTicketBook> passengerTicketBookSet = new HashSet<PassengerTicketBook>();


	@OneToMany(cascade = CascadeType.ALL,mappedBy = "bookingTable")
	private Set<TransactionTable> transactionTableSet = new HashSet<TransactionTable>();

	

	@OneToOne
	@JoinColumn(name="Cancellation_ID")
	private CancellationTable cancellationTable;





	//-------------------CONSTRUCTOR -----------------------




	public TransactionTable(String trannsactionId, String transactionType, String transactionMode,
			float transactionAmount, String transactionStatus, BookingTable bookingTable,
			Set<TransactionTable> transactionTableSet, CancellationTable cancellationTable) {
		super();
		this.trannsactionId = trannsactionId;
		this.transactionType = transactionType;
		this.transactionMode = transactionMode;
		this.transactionAmount = transactionAmount;
		this.transactionStatus = transactionStatus;
		this.bookingTable = bookingTable;
		this.transactionTableSet = transactionTableSet;
		this.cancellationTable = cancellationTable;
	}


	

	//------------------- GETTER AND SETTER METHOD -----------------------
	
	
	
	public String getTrannsactionId() {
		return trannsactionId;
	}



	public void setTrannsactionId(String trannsactionId) {
		this.trannsactionId = trannsactionId;
	}



	public String getTransactionType() {
		return transactionType;
	}



	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}



	public String getTransactionMode() {
		return transactionMode;
	}



	public void setTransactionMode(String transactionMode) {
		this.transactionMode = transactionMode;
	}



	public float getTransactionAmount() {
		return transactionAmount;
	}



	public void setTransactionAmount(float transactionAmount) {
		this.transactionAmount = transactionAmount;
	}



	public String getTransactionStatus() {
		return transactionStatus;
	}



	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}



	public BookingTable getBookingTable() {
		return bookingTable;
	}



	public void setBookingTable(BookingTable bookingTable) {
		this.bookingTable = bookingTable;
	}



	public Set<TransactionTable> getTransactionTableSet() {
		return transactionTableSet;
	}



	public void setTransactionTableSet(Set<TransactionTable> transactionTableSet) {
		this.transactionTableSet = transactionTableSet;
	}



	public CancellationTable getCancellationTable() {
		return cancellationTable;
	}



	public void setCancellationTable(CancellationTable cancellationTable) {
		this.cancellationTable = cancellationTable;
	}

	
	




	


	
	
	
	
	
	
	
	
}
