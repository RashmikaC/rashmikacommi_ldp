package dip.violation;

import dip.correction.Reservation;

public class BusReservation implements Reservation {
    @Override
    public void reserve() {
        System.out.println("Bus is reserved");
    }
}
