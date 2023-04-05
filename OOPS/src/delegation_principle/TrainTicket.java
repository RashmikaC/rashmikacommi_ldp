package delegation_principle;

public class TrainTicket implements TravelBooking{
    @Override
    public void bookTicket() {
        System.out.println("Train ticket booked!");
    }
}
