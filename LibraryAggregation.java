import java.util.ArrayList;
import java.util.List;

public class LibraryAggregation {
    public static void main(String[] args) {
        Book book1 = new Book("The Palace of Illusions", "Chitra Banerjee Divakaruni ");
        Book book2 = new Book("The Immortals of Meluha", "Amish Tripathi ");
        Book book3 = new Book("Swami and Friends", "R.K. Narayan ");

        Library library1 = new Library("City Library");
        Library library2 = new Library("University Library");
		
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book2); 
        library2.addBook(book3);

        library1.displayLibraryBooks();
        library2.displayLibraryBooks();
    }
}

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    private String name;
    private List<Book> books; 

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayLibraryBooks() {
        System.out.println("\nLibrary: " + name);
        for (Book book : books) {
            book.displayBookInfo();
        }
    }
}

