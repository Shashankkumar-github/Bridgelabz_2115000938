import java.util.Scanner;

class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Available: " + isAvailable);
    }

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter Book Title: ");
        String title = scn.nextLine();
        System.out.print("Enter Author Name: ");
        String author = scn.nextLine();
        System.out.print("Enter Price: ");
        double price = scn.nextDouble();

        LibraryBook book = new LibraryBook(title, author, price);
        book.displayBook();

        System.out.print("Do you want to borrow the book? (yes/no): "); 
        String response = scn.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            book.borrowBook();
            book.displayBook();
        }
    }
}
