class Book {
    String title, author, genre;
    int id;
    boolean isAvailable;
    Book next, prev;

    public Book(String title, String author, String genre, int id, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.id = id;
        this.isAvailable = isAvailable;
        this.next = this.prev = null;
    }
}

class Library {
    private Book head, tail;
    private int count;

    public void addAtBeginning(String title, String author, String genre, int id, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, id, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        count++;
    }

    public void addAtEnd(String title, String author, String genre, int id, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, id, isAvailable);
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        count++;
    }

    public void removeById(int id) {
        if (head == null) return;
        if (head.id == id) {
            head = head.next;
            if (head != null) head.prev = null;
            count--;
            return;
        }
        Book temp = head;
        while (temp != null && temp.id != id) {
            temp = temp.next;
        }
        if (temp == null) return;
        if (temp.next != null) temp.next.prev = temp.prev;
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp == tail) tail = temp.prev;
        count--;
    }

    public Book searchByTitle(String title) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void updateAvailability(int id, boolean status) {
        Book temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.isAvailable = status;
                return;
            }
            temp = temp.next;
        }
    }

    public void displayForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println("Book: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", ID: " + temp.id + ", Available: " + temp.isAvailable);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println("Book: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", ID: " + temp.id + ", Available: " + temp.isAvailable);
            temp = temp.prev;
        }
    }

    public int countBooks() {
        return count;
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();
        library.addAtEnd("Malgudi Days", "R.K. Narayan", "Fiction", 201, true);
        library.addAtEnd("Godan", "Munshi Premchand", "Classic", 202, false);
        library.addAtBeginning("The Guide", "R.K. Narayan", "Drama", 203, true);
        library.addAtEnd("Gitanjali", "Rabindranath Tagore", "Poetry", 204, true);
        
        System.out.println("Library Books (Forward Order):");
        library.displayForward();
        
        System.out.println("Library Books (Reverse Order):");
        library.displayReverse();
        
        System.out.println("Total Books: " + library.countBooks());
        
        Book searchResult = library.searchByTitle("Godan");
        if (searchResult != null) {
            System.out.println("Book Found: " + searchResult.title + " by " + searchResult.author);
        } else {
            System.out.println("Book not found.");
        }
        
        library.updateAvailability(202, true);
        System.out.println("Updated Library:");
        library.displayForward();
        
        library.removeById(203);
        System.out.println("Library after removing a book:");
        library.displayForward();
    }
}
