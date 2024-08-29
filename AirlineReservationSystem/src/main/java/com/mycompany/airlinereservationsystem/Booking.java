package com.mycompany.airlinereservationsystem;

public class Booking {

    private Passenger passenger;
    private Flight flight;

    public Booking(Passenger passenger, Flight flight) {
        this.passenger = passenger;
        this.flight = flight;
    }

   

    public void confirmBooking() {
        System.out.println("Booking Confirmed for " + passenger.getName() + " on flight " + flight.getFlightDetails());
        flight.bookSeat();
    }

}
