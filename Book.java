class Book {
    private static String libraryName = "Central Library";
    private final String isbn;
    private String title;
    private String author;


    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }
    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1999", "RD Sharma", "12345");
        book1.displayDetails();

        Book.displayLibraryName();
    }
}
