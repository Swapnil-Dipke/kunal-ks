package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Admin;
import com.example.demo.layer2.Booking;
import com.example.demo.layer2.Transaction;
import com.example.demo.layer3.BookingRepositoryImpl;

@SpringBootTest
class AirlineReservationApplicationTests {

	@Test
	void contextLoads() {
	}

	
	
	

@Autowired
BookingRepositoryImpl bookingRepository;

@Test
void insertBookingTest() {
Booking bkt =new Booking();
//bkt.setBookingId(001);
bkt.setEconomySeatsBooked(22);
   bkt.setBookingStatus("done");
   bkt.setBookingDate(LocalDate.of(2021,11,11));
   bkt.setBusinessSeatsBooked(23);
   bkt.setJourneyType("vacation");
   bkt.setTotalCost(20);
   bookingRepository.insertBooking(bkt);
//   bookingRepository.insertBooking(bkt);  
}






@Test
void SelectBookingTest() {

Booking bkt = bookingRepository.selectBooking(80);

System.out.println("Booking_Table  Booking_Id   is : "+ bkt.getBookingId());
System.out.println("Booking_Table Ac_Seats_Booked  : "+ bkt.getEconomySeatsBooked());
System.out.println("Booking_Table Booking_status  : "+ bkt.getBusinessSeatsBooked());
System.out.println("Booking_Table  Booking_Date is:"+bkt.getBookingDate());
System.out.println("Booking_Table  Non_Ac_Seats is:"+bkt.getBookingStatus());
System.out.println("Booking_Table  Return_Id is:"+bkt.getJourneyType());
System.out.println("Booking_Table  Total_cost is:"+bkt.getTotalCost());
}




@Test
void SelectAllBookingTest() {
//List <Booking> bktList=bookingRepository.findAll("Booking");

List <Booking >bktList=bookingRepository.selectAllBooking();
for(Booking bkt:bktList) {
System.out.println("Booking_Table  Booking_Id   is : "+ bkt.getBookingId());
System.out.println("Booking_Table Ac_Seats_Booked  : "+ bkt.getEconomySeatsBooked());
System.out.println("Booking_Table Booking_status  : "+ bkt.getBusinessSeatsBooked());
System.out.println("Booking_Table  Booking_Date is:"+bkt.getBookingDate());
System.out.println("Booking_Table  Non_Ac_Seats is:"+bkt.getBookingStatus());
System.out.println("Booking_Table  Return_Id is:"+bkt.getJourneyType());
System.out.println("Booking_Table  Total_cost is:"+bkt.getTotalCost());

}
}


//
//@Test
//void SelectAllBookingTest() {
//List <Booking_Table> bktList;
//
//bktList=bookingRepo.selectAllBooking_Table();
//for(Booking_Table bkt:bktList) {
//System.out.println("Booking_Table  Booking_Id   is : "+ bkt.getBooking_Id());
//System.out.println("Booking_Table Ac_Seats_Booked  : "+ bkt.getAc_Seats_Booked());
//System.out.println("Booking_Table Booking_status  : "+ bkt.getAc_Seats_Booked());
//System.out.println("Booking_Table  Booking_Date is:"+bkt.getBooking_Date());
//System.out.println("Booking_Table  Non_Ac_Seats is:"+bkt.getNon_Ac_Seats_Booked());
//System.out.println("Booking_Table  Return_Id is:"+bkt.getReturn_Id());
//System.out.println("Booking_Table  Total_cost is:"+bkt.getTotal_cost());
//
//}
//}
//
//@Test
//public void updateBookingTest() {
//Booking_Table bkt = new  Booking_Table();
//bkt.setBooking_Id(30);
//bkt.setAc_Seats_Booked("yes");
//bkt.setBooking_Status("sucessful");
//bkt.setBooking_Date(LocalDate.of(2021,11,11));
//bkt.setNon_Ac_Seats_Booked("no");
//bkt.setReturn_Id(10);
//bkt.setTotal_cost(1200);
//bookingRepository.updateBooking_Table(bkt);
//}


//     @Test
//     void deleteBookingTest(){
// Booking_Table payee = new Booking_Table();
// bookingRepository.deleteBooking_Table(31);
// 
//}

	
	
	
	
	
	
	
	
}
