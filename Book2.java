import java.util.Scanner;

class Book2{
    public String ISBN; 
    protected String title; 
    private String author; 

    public Book2(String ISBN, String title, String author){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public void displayBook() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
    }
}


class EBook extends Book2{
    private double fileSizeMB;

    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    public void displayEBook() {
        System.out.println("E-Book - ISBN: " + ISBN + ", Title: " + title + ", File Size: " + fileSizeMB + "MB");
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ISBN: ");
        String ISBN = scanner.nextLine();

        System.out.print("Enter Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Author: ");
        String author = scanner.nextLine();

        System.out.print("Enter File Size (MB) for E-Book: ");
        double fileSizeMB = scanner.nextDouble();

        Book2 book= new Book(ISBN, title, author);
        EBook ebook = new EBook(ISBN, title, author, fileSizeMB);

        System.out.println("\nBook Details:");
        book.displayBook();

        System.out.println("\nE-Book Details:");
        ebook.displayEBook();
    }
}
