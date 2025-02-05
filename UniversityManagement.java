import java.util.ArrayList;
import java.util.List;

public class UniversityManagement {
    public static void main(String[] args) {
       
        University university = new University("GLA University");

        Student student1 = new Student("Raj");
        Student student2 = new Student("Shashank");

        Professor professor1 = new Professor("Dr. Saxena");
        Professor professor2 = new Professor("Dr. manoj");

        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Computer Science");
		
        university.addStudent(student1);
        university.addStudent(student2);
        university.addProfessor(professor1);
        university.addProfessor(professor2);
        university.addCourse(course1);
        university.addCourse(course2);

        professor1.assignCourse(course1);
        professor2.assignCourse(course2);

        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course2);

        university.displayUniversityDetails();
        student1.displayEnrolledCourses();
        professor1.displayTaughtCourses();
    }
}


class Student {
    private String name;
    private List<Course> enrolledCourses;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    public void displayEnrolledCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course course : enrolledCourses) {
            System.out.println("   " + course.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}


class Professor {
    private String name;
    private List<Course> taughtCourses;

    public Professor(String name) {
        this.name = name;
        this.taughtCourses = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        taughtCourses.add(course);
        course.assignProfessor(this);
        System.out.println(name + " is assigned to teach " + course.getCourseName());
    }

    public void displayTaughtCourses() {
        System.out.println(name + " teaches:");
        for (Course course : taughtCourses) {
            System.out.println("   " + course.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}


class Course {
    private String courseName;
    private List<Student> enrolledStudents;
    private Professor professor;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void displayCourseDetails() {
        System.out.println("\nCourse: " + courseName);
        System.out.println("Professor: " + (professor != null ? professor.getName() : "Not assigned"));
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println("   " + student.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}


class University {
    private String name;
    private List<Student> students;
    private List<Professor> professors;
    private List<Course> courses;

    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void displayUniversityDetails() {
        System.out.println("\nUniversity: " + name);
        System.out.println("Courses Offered:");
        for (Course course : courses) {
            course.displayCourseDetails();
        }
    }
}


