import dip.correction.*;
//import dip.violation.CarReservation;
//import dip.violation.OnlineRegistration;
//import dip.violation.VehicleRentalService;
import lsp.correction.BikeRequirements;
import lsp.correction.GearBikeRequirements;

public class Main {
    public static void main(String[] args) {
//        MarutiCar car=new MarutiCar();
//        ReservedCar reservedCar=new ReservedCar(car);
//        reservedCar.rentCar();
//        Car car=new FerrariCar();
//        ReservedCar reservedCar=new ReservedCar(car);
//        reservedCar.rentCar();
        BikeRequirements bikeReq=new GearBikeRequirements();
        bikeReq.helmet();
        bikeReq.drivingLicense();
//        OnlineRegistration reg=new OnlineRegistration();
//        CarReservation res=new CarReservation();
//        VehicleRentalService service=new VehicleRentalService(reg,res);
//        service.doRegistration();
//        service.doReservation();
        Registration reg=new OnlineRegistration();
        Reservation res=new BusReservation();
        RentalService service=new VehicleRentalService(reg,res);
        service.doRegistration();
        service.doReservation();
    }
}