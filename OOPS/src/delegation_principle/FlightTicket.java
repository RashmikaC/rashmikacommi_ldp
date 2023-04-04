package delegation_principle;

public class FlightTicket implements  TravelBooking{
    @Override
    public void bookTicket() {
        System.out.println("Flight ticket booked!");
    }
}
