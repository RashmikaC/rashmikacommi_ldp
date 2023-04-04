package vehicle_rental_service;

import java.util.Scanner;

public class Bike extends BikeRequirements implements CommonServices {
    public Bike(){
        super();
        Scanner input=new Scanner(System.in);
        boolean userChoice;
        System.out.println("Enter true or false for obtaining following services:");
        System.out.println("Wifi service?:");
        userChoice =input.nextBoolean();
        provideWifi(userChoice);
        System.out.println("Navigation system?:");
        userChoice =input.nextBoolean();
        provideNavigationSystem(userChoice);
        System.out.println("Thank you for choosing");
    }

    @Override
    public void provideWifi(boolean userChoice) {
        if(userChoice)
        {
            // required code to add this service
            System.out.println("provided Wifi");
        }
    }

    @Override
    public void provideNavigationSystem(boolean userChoice) {
        if(userChoice){
            // required code to add this service
            System.out.println("provided Navigation System");
        }
    }
}
