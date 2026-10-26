import java.util.Scanner;
 
interface Student {
    void studentDetails(String name);
}

interface Course {
    void courseDetails(String course);
}

class Registration implements Student, Course {

    String studentName;
    String courseName;

    public void studentDetails(String name) {
        studentName = name;
    }

    public void courseDetails(String course) {
        courseName = course;
    }

    void display() {
        System.out.println("\n--- Course Registration Details ---");
        System.out.println("Student Name : " + studentName);
        System.out.println("Course Name  : " + courseName);
        System.out.println("Registration Successful!");
    }
}

public class multipleinterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();

        Student s = new Registration();

        s.studentDetails(name);

        Course c = (Course) s;

        c.courseDetails(course);

        Registration r = (Registration) s;
        r.display();

    }
}
