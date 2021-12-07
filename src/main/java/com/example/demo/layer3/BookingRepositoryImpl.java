package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Booking;



@Repository
public class BookingRepositoryImpl extends BaseRepository implements BookingRepository {


@Transactional
public void insertBooking(Booking ibobj) {
	
super.persist(ibobj); // invoking the dummy persist of the super class
System.out.println(" insertBooking_Table inserted...");

}


@Override
public Booking selectBooking(int booking_Id) {

System.out.println("Booking_TableRepositoryImpl : selecting Booking_Table by booking_Id");
Booking book = super.find(Booking.class, booking_Id);

return book;
}



@Transactional
public void updateBooking(Booking bobj) {
// TODO Auto-generated method stub
System.out.println(" Booking_TableRepositoryImpl: Updating Booking_Table...");
super.merge(bobj);

}

@Transactional
public void deleteBooking(int booking_Id) {
// TODO Auto-generated method stub
System.out.println(" Booking_TableRepositoryImpl: Deleting Booking_Table");
super.remove(Booking.class, booking_Id);

}

@Override
public List selectAllBooking() {
	List<Booking> bktList = new ArrayList<Booking>();
	System.out.println(" Booking_TableRepositoryImpl: select All Booking_Table");
	return super.findAll("Booking");

}





}
