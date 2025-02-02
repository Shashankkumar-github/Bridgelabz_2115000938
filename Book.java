import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;
	
	public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }
	
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
		
        System.out.print("Enter Book Title: ");
        String title = scn.nextLine();

        System.out.print("Enter Author Name: ");
        String author = scn.nextLine();

        System.out.print("Enter Price: ");
        double price = scn.nextDouble();

        Book book = new Book(title, author, price);
        book.displayBookDetails();
    }
}
