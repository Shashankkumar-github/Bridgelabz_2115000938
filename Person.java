import java.util.Scanner;

class Person {
    private String name;
    private int age;
    private String city;

    
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.city = "Unknown";
    }
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.city = other.city;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
    }
}

public class PersonCloneTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter City: ");
        String city = scanner.nextLine();

        Person originalPerson = new Person(name, age, city);
        System.out.println("\nOriginal Person:");
        originalPerson.displayPerson();

        Person clonedPerson = new Person(originalPerson);
        System.out.println("\nCloned Person:");
        clonedPerson.displayPerson();
    }
}
