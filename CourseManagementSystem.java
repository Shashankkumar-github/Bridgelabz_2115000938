public class CourseManagementSystem {
    public static void main(String[] args) {
        Course basicCourse = new Course("Introduction to Java", 6);
        OnlineCourse onlineCourse = new OnlineCourse("Web Development", 8, "Udemy", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Data Science", 12, "Coursera", true, 299.99, 20);

        basicCourse.displayCourseInfo();
        System.out.println();
        onlineCourse.displayCourseInfo();
        System.out.println();
        paidCourse.displayCourseInfo();
    }
}

class Course {
    protected String courseName;
    protected int duration; 

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
    }
}

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Fee: $" + fee + ", Discount: " + discount + "%");
    }
}

