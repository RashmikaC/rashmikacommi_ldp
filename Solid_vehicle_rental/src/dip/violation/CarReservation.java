package dip.violation;

import dip.correction.Reservation;

public class CarReservation implements Reservation {
    @Override
    public void reserve() {
        System.out.println("Car is reserved");
    }
}
