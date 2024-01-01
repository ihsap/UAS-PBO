import java.util.ArrayList;
import java.util.List;

// Interface untuk objek yang dapat memproses pembayaran
interface PaymentProcessor {
    void processPayment(User user, int amount);
}

// Class untuk merepresentasikan Sistem Pembelian Tiket Bus
public class TicketingSystem implements PaymentProcessor {
    List<Seat> seats;

    public TicketingSystem() {
        this.seats = new ArrayList<>();
        // Inisialisasi kursi, misalnya 30 kursi
        for (int i = 1; i <= 30; i++) {
            seats.add(new Seat(i, true));
        }
    }

    public void showSchedule(BusProvider busProvider) {
        busProvider.provideSchedule();
        // Logika menampilkan jadwal dan ketersediaan kursi
    }

    public void processPayment(User user, int seatNumber, String schedule) {
        // Logika pembelian tiket
        Seat selectedSeat = seats.get(seatNumber - 1);
        if (selectedSeat.isAvailable) {
            selectedSeat.isAvailable = false;
            System.out.println("Pembelian tiket berhasil untuk " + user.name + ". Kursi: " + seatNumber + ", Jam Berangkat: " + schedule);
        } else {
            System.out.println("Maaf, kursi telah dipesan oleh orang lain.");
        }
    }

    @Override
    public void processPayment(User user, int amount) {
        // Implementasi pembayaran
        System.out.println("Pembayaran sebesar " + amount + " dari " + user.name + " berhasil diproses.");
    }
}
