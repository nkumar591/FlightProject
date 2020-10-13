/**
 * 
 */
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Flight;
import com.example.demo.service.FlightManageService;

/**
 * @author AAdarsh
 *
 */
@RestController
@RequestMapping(value = "/flight")
public class FlightController {
	
	@Autowired
	private FlightManageService flightManageService;
	
	
	@GetMapping("/create/{flightNumber}")
	public Flight createFlight(@PathVariable String flightNumber) {
		
		return this.flightManageService.createFlight(flightNumber);
	}
	
	@GetMapping("/findAll")
	public List<Flight> findFlights() {
		
		return this.flightManageService.findFlights();
	}

}
