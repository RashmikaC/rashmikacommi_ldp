package vehicle_rental_service;

public class BikeReservation extends Bike implements Reservation{
    public BikeReservation(){
        super();
    }
    @Override
    public void reserve() {
        System.out.println("Bike is reserved");
    }
}
