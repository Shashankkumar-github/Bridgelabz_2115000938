import java.util.ArrayList;
import java.util.List;

public class UniversityComposition {
    public static void main(String[] args) {
        University university = new University("GLA");

        university.addDepartment("Computer Science");
        university.addDepartment("Physics");

        Faculty faculty1 = new Faculty("Dr. Raj");
        Faculty faculty2 = new Faculty("Dr. Shashank");

        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        university.displayUniversity();
    }
}
class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void displayFaculty() {
        System.out.println("Faculty: " + name);
    }
}

class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public void displayDepartment() {
        System.out.println("Department: " + name);
    }
}

class University {
    private String name;
    private List<Department> departments;
    private List<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void displayUniversity() {
        System.out.println("\nUniversity: " + name);
        for (Department dept : departments) {
            dept.displayDepartment();
        }
        for (Faculty faculty : faculties) {
            faculty.displayFaculty();
        }
    }
}


