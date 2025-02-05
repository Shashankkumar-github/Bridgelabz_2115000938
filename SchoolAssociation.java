import java.util.ArrayList;
import java.util.List;


public class SchoolAssociation {
    public static void main(String[] args) {
        School school = new School("Springfield High");

        Student student1 = new Student("Raj");
        Student student2 = new Student("Shashank");

        school.addStudent(student1);
        school.addStudent(student2);

        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        student1.enrollInCourse(math);
        student1.enrollInCourse(science);
        student2.enrollInCourse(science);

        school.displayStudents();
        student1.displayEnrolledCourses();
        student2.displayEnrolledCourses();
        math.displayStudents();
        science.displayStudents();
    }
}


class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void displayStudents() {
        System.out.println("Course: " + courseName + " - Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println("   " + student.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}
class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void displayEnrolledCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course course : courses) {
            System.out.println("   " + course.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}

class School {
    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("\nSchool: " + schoolName);
        for (Student student : students) {
            System.out.println("   " + student.getName());
        }
    }
}

