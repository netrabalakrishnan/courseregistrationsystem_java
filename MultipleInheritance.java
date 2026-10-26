import java.util.Scanner;
class Student {
    String studentName;

    void getStudent(String name) {
        studentName = name;
    }
}
class Course extends Student {
    String courseName;

    void getCourse(String course) {
        courseName = course;
    }
}
class Registration extends Course {

    void register() {
        System.out.println("\nRegistration Completed.");
    }
}
class Fee extends Registration {

    void payFee() {
        System.out.println("Course Fee Paid Successfully.");
    }
}
class Confirmation extends Fee {

    void confirm() {
        System.out.println("Registration Confirmed.");
    }
}
class Certificate extends Confirmation {

    void generateCertificate() {
        System.out.println("Course Certificate Generated.");
    }
}
class Completion extends Certificate {

    void display() {
        System.out.println("\n----- Course Details -----");
        System.out.println("Student Name : " + studentName);
        System.out.println("Course Name  : " + courseName);
        System.out.println("Course Registration Process Completed.");
    }
}
public class MultipleInheritance{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Completion c = new Completion();

        System.out.println("===== Course Registration System =====");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();

        c.getStudent(name);
        c.getCourse(course);

        c.register();
        c.payFee();
        c.confirm();
        c.generateCertificate();
        c.display();

        sc.close();
    }
}