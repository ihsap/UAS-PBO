public class User {
    String name;
    String contactInfo;

    public User(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public void buyTicket(TicketingSystem ticketingSystem, int seatNumber, String schedule) {
        ticketingSystem.processPayment(this, seatNumber, schedule);
    }
}
