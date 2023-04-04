package dip.correction;

public abstract class RentalService {
    Registration registration;
    Reservation reservation;
    RentalService(Registration registration,Reservation reservation){
        this.registration=registration;
        this.reservation=reservation;
    }
    public abstract void doRegistration();
    public abstract void doReservation();
}
