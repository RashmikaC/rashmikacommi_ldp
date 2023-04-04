package dip.correction;

public class BusReservation implements Reservation{
    @Override
    public void reserve() {
        System.out.println("Bus is reserved");
    }
}
