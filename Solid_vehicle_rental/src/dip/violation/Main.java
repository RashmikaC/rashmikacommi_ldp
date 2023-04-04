package dip.violation;
public class Main {
    public static void main(String[] args) {
        OnlineRegistration reg=new OnlineRegistration();
        CarReservation res=new CarReservation();
        VehicleRentalService service=new VehicleRentalService(reg,res);
        service.doRegistration();
        service.doReservation();
    }
}