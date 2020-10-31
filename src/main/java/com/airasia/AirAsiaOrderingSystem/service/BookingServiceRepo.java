package com.airasia.AirAsiaOrderingSystem.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airasia.AirAsiaOrderingSystem.model.BookingDetails;

@Repository
public interface BookingServiceRepo extends CrudRepository<BookingDetails, Integer>{
		
}
