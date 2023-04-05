package vehicle_rental_service;

import java.util.Scanner;

public abstract class CarRequirements implements RentalRequirements {
    public CarRequirements(){
        this.drivingLicense();
        this.age();
    }
    @Override
    public void drivingLicense() {
        System.out.println("Checking whether customer has driving license or not");
        //code to check whether customer has driving license or not
    }
    @Override
    public void age() {
        System.out.println("Checking whether customer has minimum required age or not");
        //code to check whether customer has minimum required age or not
    }
}
