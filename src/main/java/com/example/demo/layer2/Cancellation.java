package com.example.demo.layer2;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity  
@Table(name="Cancellation")
public class Cancellation {
	

	@Id
	@GeneratedValue
	private int cancellationId;
	
	private LocalDate cancellationDate;
	
	private String cancellationReason;
	
	private String cancellationStatus;
	
	private double refundAmount;
	


	@OneToOne
	@JoinColumn(name="Transaction_Id")
	private Transaction transaction;
	

	@OneToOne(cascade = CascadeType.ALL,mappedBy = "cancellation")
	@JoinColumn(name="Booking_Id")
	private Booking booking;


	//----------- GETTER AND SETTER METHOD --------------------
	
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


	public Transaction getTransaction() {
		return transaction;
	}


	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}


	public Booking getBooking() {
		return booking;
	}


	public void setBooking(Booking booking) {
		this.booking = booking;
	}


	//----------------- TO STRING ------------------------------------------------
	@Override
	public String toString() {
		return "Cancellation [cancellationId=" + cancellationId + ", cancellationDate=" + cancellationDate
				+ ", cancellationReason=" + cancellationReason + ", cancellationStatus=" + cancellationStatus
				+ ", refundAmount=" + refundAmount + ", transaction=" + transaction + ", booking=" + booking + "]";
	}
	
	
	
	
}
