public class Main {
    public static void main(String[] args) {
        User user = new User("Kaeysan", "08123456789");
        TicketingSystem ticketingSystem = new TicketingSystem();
        BusProvider busProvider = new BusProvider();

        // Skenario
        ticketingSystem.showSchedule(busProvider);
        user.buyTicket(ticketingSystem, 9, "11:00 AM");
    }
}
