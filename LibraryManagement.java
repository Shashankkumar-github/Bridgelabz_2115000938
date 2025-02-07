public class LibraryManagement {
    public static void main(String[] args) {
        Author author = new Author("Malgudi Days", 1943, "R.K. Narayan", "an Indian writer known for his simple yet profound storytelling. His works, set in the fictional town of Malgudi, capture everyday life in India. Malgudi Days is a collection of short stories depicting various characters and their experiences in this small town.");
        author.displayInfo();
    }
}
class Book {
    protected String title;
    protected int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}


