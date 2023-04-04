package vehicle_rental_service;

public class CarReservation extends Car implements Reservation{
    public CarReservation(){
        super();
    }
    @Override
    public void reserve() {
        System.out.println("Car is reserved");
    }

}
