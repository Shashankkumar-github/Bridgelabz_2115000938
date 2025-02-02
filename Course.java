import java.util.Scanner;

class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "Default Institute"; 

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public double getFee() { return fee; }
    public void setFee(double fee) { this.fee = fee; }

    public static String getInstituteName() { return instituteName; }
    public static void setInstituteName(String instituteName) { Course.instituteName = instituteName; }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Course Name: ");
        String courseName = scanner.nextLine();

        System.out.print("Enter Course Duration (months): ");
        int duration = scanner.nextInt();

        System.out.print("Enter Course Fee: ");
        double fee = scanner.nextDouble();
		
        System.out.print("Enter New Institute Name: ");
        String newInstituteName = scanner.nextLine();
        Course.setInstituteName(newInstituteName);

        Course course1 = new Course(courseName, duration, fee);
        course1.displayCourseDetails();
    }
}
