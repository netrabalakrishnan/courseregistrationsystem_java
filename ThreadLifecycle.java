import java.util.Scanner;

class CourseRegistration {

    synchronized void register(String studentName, String courseName) {

        System.out.println(studentName + " is registering for " + courseName);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Registration completed for " + studentName);
    }
}

class Student extends Thread {

    CourseRegistration course;
    String studentName;
    String courseName;

    Student(CourseRegistration course, String studentName, String courseName) {
        this.course = course;
        this.studentName = studentName;
        this.courseName = courseName;
    }

    public void run() {

        System.out.println("Thread Started");

        course.register(studentName, courseName);

        System.out.println("Thread Completed");
    }
}

public class ThreadLifecycle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course Name: ");
        String courseName = sc.nextLine();

        CourseRegistration course = new CourseRegistration();

        Student student = new Student(course, name, courseName);

        System.out.println("Thread State: " + student.getState());

        student.start();

        try {
            student.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread State: TERMINATED");

        System.out.println("Deadlock prevented by using a single synchronized resource.");

        sc.close();
    }
}