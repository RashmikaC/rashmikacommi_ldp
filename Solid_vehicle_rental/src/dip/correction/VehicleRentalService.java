package dip.correction;

public class VehicleRentalService extends RentalService {
    public VehicleRentalService(Registration registration,Reservation reservation){
        super(registration,reservation);
    }
    public void doRegistration(){
        registration.register();
    }
    public void doReservation(){
        reservation.reserve();
    }
}
