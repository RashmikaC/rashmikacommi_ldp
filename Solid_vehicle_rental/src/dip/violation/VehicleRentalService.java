package dip.violation;

public class VehicleRentalService {
    OnlineRegistration reg ;
    CarReservation res;
    public VehicleRentalService(OnlineRegistration registration, CarReservation reservation){
        this.reg=registration;
        this.res=reservation;
    }
    public void doRegistration(){
        reg.register();
    }
    public void doReservation(){
        res.reserve();
    }
}
