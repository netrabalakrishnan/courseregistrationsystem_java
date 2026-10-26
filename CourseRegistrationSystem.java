class Course {

    // Private variables (Access Specifier)
    private String studentName;
    private String courseName;

    // Static variable
    static String collegeName = "KPR Institute of Engineering and Technology";

    // Constructor
    Course(String sName, String cName) {
        studentName = sName;
        courseName = cName;
    }

    // Method
    void display() {
        System.out.println("College Name : " + collegeName);
        System.out.println("Student Name : " + studentName);
        System.out.println("Course Name  : " + courseName);
    }

    // Method Overloading
    void registerCourse() {
        System.out.println("Course Registered Successfully.");
    }

    void registerCourse(String semester) {
        System.out.println("Course Registered for " + semester);
    }

    // Static Method
    static void collegeInfo() {
        System.out.println("Welcome to Course Registration System");
    }
}
public class CourseRegistrationSystem {
 
    public static void main(String[] args) {
        // Calling Static Method
        Course.collegeInfo();
        // Creating Object
        Course c1 = new Course("Netra", "Java Programming");
         c1.display();
        // Calling Overloaded Methods
        c1.registerCourse();
        c1.registerCourse("Semester 3");
    }
}
