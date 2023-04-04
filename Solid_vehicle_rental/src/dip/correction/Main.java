package dip.correction;

public class Main {
    public static void main(String[] args) {
        Registration reg=new OnlineRegistration();
        Reservation res=new BusReservation();
        RentalService service=new VehicleRentalService(reg,res);
        service.doRegistration();
        service.doReservation();
    }
}