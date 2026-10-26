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

    void display() {
        System.out.println("\n----- Registration Details -----");
        System.out.println("Student Name : " + studentName);
        System.out.println("Course Name  : " + courseName);
        System.out.println("Course Registered Successfully!");
    }
}
public class SingleInheritance{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Course c = new Course();

        System.out.println("===== Course Registration System =====");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();

        c.getStudent(name);
        c.getCourse(course);

        c.display();

        sc.close();
    }
}