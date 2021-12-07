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
@Table(name="Transaction")
public class Transaction {

	@Id
	@Column(name="Transaction_Id")
	private int trannsactionId;
	
	@Column(name="Transaction_Type")
	private String transactionType;
	
	@Column(name="Transaction_Mode")
	private String transactionMode;
	
	@Column(name="Transaction_Amount")
	private float transactionAmount;
	
	@Column(name="Transaction_Status")
	private String transactionStatus;
	
	

	@OneToOne(cascade = CascadeType.ALL,mappedBy = "transaction")
	@JoinColumn(name="Booking_Id")
	private Booking booking;


	@OneToOne
	@JoinColumn(name="CancellationID")
	private Cancellation cancellation;

	
	//--------------- GETTER AND SETTER METHOD -------------------

	public int getTrannsactionId() {
		return trannsactionId;
	}


	public void setTrannsactionId(int trannsactionId) {
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


	public Booking getBooking() {
		return booking;
	}


	public void setBooking(Booking booking) {
		this.booking = booking;
	}


	public Cancellation getCancellation() {
		return cancellation;
	}


	public void setCancellation(Cancellation cancellation) {
		this.cancellation = cancellation;
	}


	
	//----------------- TO STRING METHOD -----------------------------
	@Override
	public String toString() {
		return "Transaction [trannsactionId=" + trannsactionId + ", transactionType=" + transactionType
				+ ", transactionMode=" + transactionMode + ", transactionAmount=" + transactionAmount
				+ ", transactionStatus=" + transactionStatus + ", booking=" + booking + ", cancellation=" + cancellation
				+ "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}