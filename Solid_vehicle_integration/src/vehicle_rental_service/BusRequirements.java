package vehicle_rental_service;
public abstract class BusRequirements implements RentalRequirements {
    public BusRequirements(){
        this.drivingLicense();
        this.age();
        this.experience();
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
    public void experience() {
        System.out.println("Checking whether customer has experience or not");
        //code to check whether customer has experience or not
    }
}
