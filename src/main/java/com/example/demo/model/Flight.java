package com.example.demo.model;

public class Flight {
	
	
	public Flight(String flightNumber, String airlineName, String depDate, String arrivalDate, int noOfStops,
			double prize) {
		super();
		this.flightNumber = flightNumber;
		this.airlineName = airlineName;
		this.depDate = depDate;
		this.arrivalDate = arrivalDate;
		this.noOfStops = noOfStops;
		this.prize = prize;
	}
	private String flightNumber;
	private String airlineName;
	private String depDate;
	private String arrivalDate;
	private int noOfStops;
	private double prize;
	
	
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getDepDate() {
		return depDate;
	}
	public void setDepDate(String depDate) {
		this.depDate = depDate;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public int getNoOfStops() {
		return noOfStops;
	}
	public void setNoOfStops(int noOfStops) {
		this.noOfStops = noOfStops;
	}
	public double getPrize() {
		return prize;
	}
	public void setPrize(double prize) {
		this.prize = prize;
	}

}
