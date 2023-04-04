package delegation_principle;

public class TicketBookingByAgent implements TravelBooking{
    TravelBooking t;
    public TicketBookingByAgent(TravelBooking t){
       this.t=t;
    }
    @Override
    public void bookTicket() {
        t.bookTicket();
    }
}
