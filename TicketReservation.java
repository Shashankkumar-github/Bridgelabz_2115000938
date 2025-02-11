class TicketNode {
    int ticketID;
    String customerName, movieName, seatNumber, bookingTime;
    TicketNode next;

    TicketNode(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = this;
    }
}

class TicketReservationSystem {
    private TicketNode last;
    private int count;

    void addTicket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        TicketNode newNode = new TicketNode(ticketID, customerName, movieName, seatNumber, bookingTime);
        if (last == null) {
            last = newNode;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
        count++;
    }

    void removeTicket(int ticketID) {
        if (last == null) return;
        TicketNode current = last.next, prev = last;
        do {
            if (current.ticketID == ticketID) {
                if (current == last && current.next == last) {
                    last = null;
                } else {
                    prev.next = current.next;
                    if (current == last) last = prev;
                }
                count--;
                return;
            }
            prev = current;
            current = current.next;
        } while (current != last.next);
    }

    void displayTickets() {
        if (last == null) return;
        TicketNode temp = last.next;
        do {
            System.out.println("Ticket ID: " + temp.ticketID + ", Customer: " + temp.customerName + ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != last.next);
    }

    void searchTicket(String query) {
        if (last == null) return;
        TicketNode temp = last.next;
        do {
            if (temp.customerName.equalsIgnoreCase(query) || temp.movieName.equalsIgnoreCase(query)) {
                System.out.println("Ticket Found: " + temp.ticketID + ", Customer: " + temp.customerName + ", Movie: " + temp.movieName);
            }
            temp = temp.next;
        } while (temp != last.next);
    }

    int totalTickets() {
        return count;
    }
}

public class TicketReservation {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();
        system.addTicket(1, "Raj Singh", "Avatar 2", "A12", "18:00");
        system.addTicket(2, "Shashank ", "Inception", "B5", "20:00");
        system.displayTickets();
        system.searchTicket("Avatar 2");
        system.removeTicket(1);
        system.displayTickets();
        System.out.println("Total Tickets: " + system.totalTickets());
    }
}
