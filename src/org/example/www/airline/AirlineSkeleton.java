/**
 * AirlineSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */
package org.example.www.airline;

/**
 * AirlineSkeleton java skeleton for the axisService
 */
public class AirlineSkeleton implements AirlineSkeletonInterface {
	// Static flights object
	public static Flight[] flights = {
			new Flight("KL033", "10-02-2012", "amsterdam",	"kralendijk",	300),
			new Flight("KL011", "10-02-2012", "enschede",	"amsterdam",	300),
			new Flight("KL022", "10-02-2012", "dubai",		"amsterdam",	300),
			new Flight("KL044", "10-02-2012", "berlijn",	"dubai",		200),
			new Flight("KL055", "10-02-2012", "amsterdam",	"kralendijk",	100) };

	/**
	 * checkAvailability finds Flight object which have the attributes as
	 * specified in the parameter. It returns a list of flightnumbers, which
	 * are associated with the Flights found.
	 * 
	 * @param flightRequest
	 * @return flightNumberList
	 */

	public org.example.www.airline.FlightNumberList checkAvailability(
			org.example.www.airline.FlightRequest flightRequest) {

		FlightNumberList result = new FlightNumberList();
		
		for(Flight flight: flights) {
			if(flightRequest.getDeparture().equalsIgnoreCase(flight.getDeparture()) &&
			   flightRequest.getDestination().equalsIgnoreCase(flight.getDestination()) &&
			   flightRequest.getDate().equals(flight.getDate()) &&
			   flightRequest.getNumberOfPersons().compareTo(flight.getSeatsAvailable()) <= 0) {
				   result.addFlightNumber(flight.getFlightNumber());
			   }
		}
		return result;
	}

	/**
	 * The bookingRequest method allows a user to make a booking. The flightnumber and
	 * the number of persons should be specified in the attributes of the parameter.
	 * 
	 * It returns a "Successful!" message when the booking is made, or a "Fail!" message
	 * when it has failed.
	 * 
	 * @param bookingRequest
	 * @return bookingResponse
	 */

	public org.example.www.airline.BookingResponse bookFlight(
			org.example.www.airline.BookingRequest bookingRequest) {
		BookingResponse response = new BookingResponse();
		response.setBookingResponse("Fail!");
		for(Flight flight : flights) {
			if(bookingRequest.getFlightNumber().equalsIgnoreCase(flight.getFlightNumber()) && 
			   flight.getSeatsAvailable().compareTo(bookingRequest.getNumberOfPersons()) >= 0) {
					flight.setSeatsAvailable(flight.getSeatsAvailable().min(bookingRequest.getNumberOfPersons()));
					response.setBookingResponse("Succesful!");
			}
		}
		return response;
	}

}
