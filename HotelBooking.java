import java.util.Scanner;

class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public void displayBooking() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter Guest Name: ");
        String guestName = scn.nextLine();

        System.out.print("Enter Room Type (Standard/Deluxe): ");
        String roomType = scn.nextLine():

        System.out.print("Enter Number of Nights: ");
        int nights = scn.nextInt();
		
        HotelBooking booking = new HotelBooking(guestName, roomType, nights);
        booking.displayBooking();
    }
}
