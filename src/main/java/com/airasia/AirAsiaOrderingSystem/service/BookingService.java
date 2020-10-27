package com.airasia.AirAsiaOrderingSystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airasia.AirAsiaOrderingSystem.model.BookingDetails;
import com.airasia.AirAsiaOrderingSystem.service.BookingServiceRepo;


@Service
public class BookingService {
	
	@Autowired
	BookingServiceRepo brp;
	
	public List<BookingDetails> findAllBookingDetails(){
		
		List<BookingDetails> bkd = new ArrayList<BookingDetails>();
		brp.findAll().forEach(bookings -> bkd.add(bookings));
		
		return bkd;
	}
	
	public void saveOrUpdate(final BookingDetails bookingDetails) {
		brp.save(bookingDetails);
	}
}
