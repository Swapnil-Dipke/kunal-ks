package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Booking;





@Repository
public interface BookingRepository {

	void insertBooking(Booking bobj);

	Booking selectBooking(int booking_Id);
	List selectAllBooking();


	void updateBooking(Booking bobj);
	void deleteBooking(int booking_Id);

	
	
}
