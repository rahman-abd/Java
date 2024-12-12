package TrainTicketBooking;

public class Train {
    private BookTicket bookTicket = new BookTicket();

    public void run() {
        bookTicket.startBooking();
    }
}
