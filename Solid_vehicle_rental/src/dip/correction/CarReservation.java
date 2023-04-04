package dip.correction;

public class CarReservation implements Reservation{
    @Override
    public void reserve() {
        System.out.println("Car is reserved");
    }
}
