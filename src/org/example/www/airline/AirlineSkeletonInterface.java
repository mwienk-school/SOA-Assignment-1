
/**
 * AirlineSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */
    package org.example.www.airline;
    /**
     *  AirlineSkeletonInterface java skeleton interface for the axisService
     */
    public interface AirlineSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param flightRequest
         */

        
                public org.example.www.airline.FlightNumberList checkAvailability
                (
                  org.example.www.airline.FlightRequest flightRequest
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param bookingRequest
         */

        
                public org.example.www.airline.BookingResponse bookFlight
                (
                  org.example.www.airline.BookingRequest bookingRequest
                 )
            ;
        
         }
    