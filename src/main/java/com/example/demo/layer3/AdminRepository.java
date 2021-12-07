package com.example.demo.layer3;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Admin;
import com.example.demo.layer2.Flight;

@Repository
public interface AdminRepository {

void insertAdmin(Admin aobj);
void addFlight (Flight FlightId);
void updateFlight(Flight fobj);
	
}
