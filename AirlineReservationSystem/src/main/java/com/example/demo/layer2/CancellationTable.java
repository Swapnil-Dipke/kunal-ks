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
@Table(name="Cancellation")
public class CancellationTable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Cancellation_ID")
	private int cancellationId;
	
	@Column(name="Cancellation_Date")
	private LocalDate cancellationDate;
	
	@Column(name="Cancellation_Reason")
	private String cancellationReason;
	
	@Column(name="Cancellation_Status")
	private String cancellationStatus;
	
	@Column(name="Refund_Amount")
	private double refundAmount;
	
	@Column(name="Transaction_Id")
	private String Transaction_Id;
	
	
//	@OneToOne(cascade = CascadeType.ALL,  mappedBy = "cancellationTable") 
//	private BookingTable bookingTable;
	

	@OneToOne(cascade = CascadeType.ALL,  mappedBy = "cancellationTable") 
	@JoinColumn(name="Booking_Id")
	private BookingTable bookingTable;
	
	
	

	@OneToOne(cascade = CascadeType.ALL,  mappedBy = "cancellationTable") 
	@JoinColumn(name="Transaction_Id") 
	private TransactionTable transactionTable;


	
	//--------- CONSTRUCTOR ------------------------






	public CancellationTable(int cancellationId, LocalDate cancellationDate, String cancellationReason,
			String cancellationStatus, double refundAmount, String transaction_Id, BookingTable bookingTable,
			TransactionTable transactionTable) {
		super();
		this.cancellationId = cancellationId;
		this.cancellationDate = cancellationDate;
		this.cancellationReason = cancellationReason;
		this.cancellationStatus = cancellationStatus;
		this.refundAmount = refundAmount;
		Transaction_Id = transaction_Id;
		this.bookingTable = bookingTable;
		this.transactionTable = transactionTable;
	}



	//-------------- GETTER AND SETTER--------------------



	public int getCancellationId() {
		return cancellationId;
	}



	public void setCancellationId(int cancellationId) {
		this.cancellationId = cancellationId;
	}



	public LocalDate getCancellationDate() {
		return cancellationDate;
	}



	public void setCancellationDate(LocalDate cancellationDate) {
		this.cancellationDate = cancellationDate;
	}



	public String getCancellationReason() {
		return cancellationReason;
	}



	public void setCancellationReason(String cancellationReason) {
		this.cancellationReason = cancellationReason;
	}



	public String getCancellationStatus() {
		return cancellationStatus;
	}



	public void setCancellationStatus(String cancellationStatus) {
		this.cancellationStatus = cancellationStatus;
	}



	public double getRefundAmount() {
		return refundAmount;
	}



	public void setRefundAmount(double refundAmount) {
		this.refundAmount = refundAmount;
	}



	public String getTransaction_Id() {
		return Transaction_Id;
	}



	public void setTransaction_Id(String transaction_Id) {
		Transaction_Id = transaction_Id;
	}



	public BookingTable getBookingTable() {
		return bookingTable;
	}



	public void setBookingTable(BookingTable bookingTable) {
		this.bookingTable = bookingTable;
	}



	public TransactionTable getTransactionTable() {
		return transactionTable;
	}



	public void setTransactionTable(TransactionTable transactionTable) {
		this.transactionTable = transactionTable;
	}

	
	
	






	
	

}
