package vehicle_rental_service;

public abstract class BikeRequirements implements RentalRequirements {
    public BikeRequirements(){
        this.drivingLicense();
        this.age();
        this.helmet();
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
    public void helmet() {
        System.out.println("Checking whether customer has a helmet or not");
        //code to check whether customer has a helmet or not
    }
}
