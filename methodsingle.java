import java.util.Scanner;
class Student {
    String studentName;

    void display() {
        System.out.println("Student Name : " + studentName);
    }
}
class Course extends Student {
    String courseName;
    void display() {
        System.out.println("Student Name : " + studentName);
        System.out.println("Course Name  : " + courseName);
    }
}
public class methodsingle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Course c = new Course();

        System.out.print("Enter Student Name: ");
        c.studentName = sc.nextLine();

        System.out.print("Enter Course Name: ");
        c.courseName = sc.nextLine();

        c.display();

        sc.close();
    }
}
