package vehicle_rental_service;

public class BusReservation extends Bus implements Reservation{
    public BusReservation(){
        super();
    }
    @Override
    public void reserve() {
        System.out.println("Bus is reserved");
    }
}
