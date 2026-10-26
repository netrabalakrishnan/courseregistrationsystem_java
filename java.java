package registration;

import java.util.Scanner;

public class java {

    String studentName;
    String courseName;

    CourseRegistration(String studentName, String courseName) {
        this.studentName = studentName;
        this.courseName = courseName;
    }

    void display() {
        System.out.println("\n--- Course Registration ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Course Name: " + courseName);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String student = sc.nextLine();

        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();

        CourseRegistration c =
            new CourseRegistration(student, course);

        c.display();

        sc.close();
    }
}