package com.airasia.AirAsiaOrderingSystem;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.airasia.AirAsiaOrderingSystem.controller.bookingController;
import com.airasia.AirAsiaOrderingSystem.model.BookingDetails;
import com.airasia.AirAsiaOrderingSystem.service.BookingServiceRepo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class AirAsiaOrderingSystemApplicationTests {
	
	@Autowired
	private bookingController controller;
	
    @Autowired
	BookingServiceRepo brp;
    
	@Test
	public void contextLoads() {
		assertThat(controller).isNotNull();
	}
	
	@Test
	public void whenFindByName_thenReturnCustomer() {
		
		List<BookingDetails> bkd = new ArrayList<BookingDetails>();
		brp.findAll().forEach(bookings -> bkd.add(bookings));
		
		
		assertThat(brp.findAll()).isNotEmpty();
		
	}

}
