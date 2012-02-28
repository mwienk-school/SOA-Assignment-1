package org.example.www.airline;

public class Flight {
	
	private String flightNumber;
	private String date;
	private String departure;
	private String destination;
	private java.math.BigInteger seatsAvailable;
	
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public java.math.BigInteger getSeatsAvailable() {
		return seatsAvailable;
	}
	public void setSeatsAvailable(java.math.BigInteger seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}
	
	/**
	 * A Flight is an object representing a flight on a specific date
	 * @param number flightnumber
	 * @param dep departure city
	 * @param dest destination city
	 * @param seats available seats
	 */
	public Flight(String number, String date, String dep, String dest, int seats) {
		this.flightNumber = number;
		this.date = date;
		this.departure = dep;
		this.destination = dest;
		this.seatsAvailable = new java.math.BigInteger(String.valueOf(seats));
	}

}
