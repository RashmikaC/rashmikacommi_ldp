package isp.violation;

public interface AdditionalServices {
    public void provideWifi(boolean userChoice);//bike,car,bus
    public void provideNavigationSystem(boolean userChoice);//bike,car,bus
    public void provideChildSafetySeats(boolean userChoice);//car,bus
    public void provideEntertainmentSystem(boolean userChoice);//car,bus
}
