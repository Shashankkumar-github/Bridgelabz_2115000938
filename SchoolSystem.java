public class SchoolSystem {
    public static void main(String[] args) {
        Person[] people = {
            new Teacher("Mr. Raj", 30, "Mathematics"),
            new Student("Shashank", 15, 10),
            new Staff("Aishwarya", 25, "Administration")
        };

        for (Person person : people) {
            person.displayInfo();
            if (person instanceof Teacher) {
                ((Teacher) person).displayRole();
            } else if (person instanceof Student) {
                ((Student) person).displayRole();
            } else if (person instanceof Staff) {
                ((Staff) person).displayRole();
            }
            System.out.println();
        }
    }
}
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println(name + " is a Teacher who teaches " + subject + ".");
    }
}

class Student extends Person {
    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println(name + " is a Student in Grade " + grade + ".");
    }
}


class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println(name + " is a Staff member in the " + department + " department.");
    }
}


