class TicketBookingSystem {
    private int availableTickets;

    public TicketBookingSystem(int totalTickets) {
        availableTickets = totalTickets;
    }

    public synchronized boolean bookTicket(int numTickets) {
        if (numTickets > availableTickets) {
            return false;
        }

        try {
            while (availableTickets < numTickets) {
                wait();
            }

            Thread.sleep(1000);

            availableTickets -= numTickets;
            System.out.println(Thread.currentThread().getName() + " booked " + numTickets + " ticket(s).");
            return true;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }

    public synchronized void releaseTickets(int numTickets) {
        availableTickets += numTickets;
        System.out.println(Thread.currentThread().getName() + " released " + numTickets + " ticket(s).");
        notifyAll();
    }
}

class BookingThread extends Thread {
    private TicketBookingSystem bookingSystem;
    private int numTickets;

    public BookingThread(TicketBookingSystem system, int tickets) {
        bookingSystem = system;
        numTickets = tickets;
    }

    @Override
    public void run() {
        if (bookingSystem.bookTicket(numTickets)) {
            System.out.println(Thread.currentThread().getName() + " successfully booked " + numTickets + " ticket(s).");
        } else {
            System.out.println(Thread.currentThread().getName() + " failed to book tickets.");
        }

        bookingSystem.releaseTickets(numTickets);
    }
}

public class TicketingSystem {
    public static void main(String[] args) {
        TicketBookingSystem bookingSystem = new TicketBookingSystem(10);
        int numThreads = 5;

        for (int i = 1; i <= numThreads; i++) {
            BookingThread thread = new BookingThread(bookingSystem, i);
            thread.start();
        }
    }
}
