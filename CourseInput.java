import java.util.Scanner;

class Course {

    String studentName;
    String courseName;

    // Constructor
    Course(String sName, String cName) {
        studentName = sName;
        courseName = cName;
    }

    // Method to display details
    void display() {
        System.out.println("Student Name : " + studentName);
        System.out.println("Course Name  : " + courseName);
    }
}

public class CourseInput{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Course Registration System");
         // Getting input from the user
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();

        // Creating an object
        Course c1 = new Course(name, course);

        // Displaying details
        c1.display();

        sc.close();
    }
}
