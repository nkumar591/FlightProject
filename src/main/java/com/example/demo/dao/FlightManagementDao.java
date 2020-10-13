package com.example.demo.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Flight;

@Repository
public class FlightManagementDao {
	
			
	private List<Flight> flightList = new ArrayList<Flight>();
	
	
	public List<Flight> findFlights(){
		
		if(flightList.isEmpty()) {
		flightList.add(new Flight("DL384", "DELTA", "22-10-2020", "23-10-2020", 0, 1272.12));
		flightList.add(new Flight("AC466", "AIRCHINA", "21-10-2020", "21-10-2020", 0, 2467.44));
		flightList.add(new Flight("DL746", "DELTA", "19-10-2020", "20-10-2020", 0, 1123.11));
		flightList.add(new Flight("AC467", "AIRCHINA", "18-10-2020", "19-10-2020", 0, 4847.56));
		flightList.add(new Flight("AC698", "AIRCHINA", "27-10-2020", "27-10-2020", 0, 3948.34));
		flightList.add(new Flight("DL214", "DELTA", "22-10-2020", "23-10-2020", 0, 5373.34));
		}

		return flightList.stream().sorted(Comparator.comparingDouble(Flight::getPrize)).collect(Collectors.toList());
	}

	public Flight createFlight(String flightNumber) {
		Flight flight = new Flight(flightNumber, "DELTA", "22-10-2020", "23-10-2020", 0, 5373.34);
		if(flightList.isEmpty()) {
			this.findFlights();
		}
		flightList.add(flight);
		return flight;
	}

}
