import java.util.Scanner;
class HandleBookDetails {
    String title;
    String author;
    double price;
	
    public HandleBookDetailsBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String name = scn.nextLine();
		String author = scn.nextLine()
		double price = scn.nextDouble();
        HandleBookDetailsBook book = new HandleBookDetailsBook(name,suthor,price);
        book.displayDetails();
    }
}
