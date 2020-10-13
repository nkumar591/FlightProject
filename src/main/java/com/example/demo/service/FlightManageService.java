package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FlightManagementDao;
import com.example.demo.model.Flight;

@Service
public class FlightManageService {

	@Autowired
	private FlightManagementDao flightDao;
	
	public Flight createFlight(String flightNumber) {
		return this.flightDao.createFlight(flightNumber);
	}
	
	public List<Flight> findFlights() {
		return this.flightDao.findFlights();
	}

}
