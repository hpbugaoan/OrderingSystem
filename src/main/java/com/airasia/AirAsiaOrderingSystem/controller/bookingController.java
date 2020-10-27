package com.airasia.AirAsiaOrderingSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.airasia.AirAsiaOrderingSystem.model.BookingDetails;
import com.airasia.AirAsiaOrderingSystem.service.BookingService;

@Controller
public class bookingController {
	
	@Autowired
	BookingService bookingservice;
	
	@GetMapping("/")
	public String showHome(Model model) {
		return "index";
	}

	@GetMapping("/registration_form")
	public String showRegistrationForm(Model model) {
		BookingDetails bookingDetails = new BookingDetails();
		model.addAttribute("booking", bookingDetails);
		return "registration_form";
	}

	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute BookingDetails bookingDetails, Model model) {		
		// add database features
		bookingservice.saveOrUpdate(bookingDetails);
		model.addAttribute("bookingDetails", bookingDetails);
		return "display_form";
	}
	
	@GetMapping("/view_bookings")
	public String viewBookings(Model model) {
		
		List<BookingDetails> bookingDetails = bookingservice.findAllBookingDetails();
		model.addAttribute("booking", bookingDetails);
		return "view_bookings";
	}
}
