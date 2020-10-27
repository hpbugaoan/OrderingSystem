package com.airasia.AirAsiaOrderingSystem.model;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "booking_details")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Component
@SequenceGenerator(name="hotel_id_seq", initialValue=5, allocationSize=100)
public class BookingDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="hotel_id_seq")
	@Column(name = "hotel_id", nullable = false)
	private int hotelId;
	
	@Column(name = "hotel_name", nullable = false)
	private String hotelName;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "checkin_date", nullable = false)
	private LocalDate checkinDate;
	
	@Column(name = "checkout_date", nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate checkOutDate;
	
	@Column(name = "cus_name", nullable = false)
	private String cusName;
	
	@Column(name = "cus_email", nullable = false)
	private String cusEmail;
	
	@Column(name = "phone_num", nullable = false)
	private String phoneNum;
	
	@Column(name = "room_name", nullable = false)
	private String roomName;
	
	@Column(name = "num_guest", nullable = false)
	private int numGuest;
	
	@Column(name = "total_amount", nullable = false)
	private int TotalAmount;
	
}
