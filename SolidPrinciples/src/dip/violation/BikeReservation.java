package dip.violation;

import dip.correction.Reservation;

public class BikeReservation implements Reservation {
    @Override
    public void reserve() {
        System.out.println("Bike is reserved");
    }
}
