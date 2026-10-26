import java.util.Scanner;

class Course
{
    String studentName;
    int registerNo;
    String courseName;

    void input()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        studentName = sc.nextLine();

        System.out.println("Enter Register Number:");
        registerNo = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Course Name:");
        courseName = sc.nextLine();
    }

    void display()
    {
        System.out.println();
        System.out.println("===================================");
        System.out.println("       COURSE REGISTRATION");
        System.out.println("===================================");
        System.out.println("Student Name : " + studentName);
        System.out.println("Register No  : " + registerNo);
        System.out.println("Course Name  : " + courseName);
        System.out.println("Registration : Successful");
    }
}
public class CourseRegistration
{
    public static void main(String[] args)
    {
        Course c = new Course();

        c.input();
        c.display();
    }
}