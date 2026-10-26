import java.util.Scanner;

class CourseRegistr {

    int seats = 0;

    synchronized void register(String studentName) {

        if (seats == 0) {
            System.out.println(studentName + " is waiting for a seat...");

            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        seats--;
        System.out.println(studentName + " registered successfully!");
    }

    synchronized void addSeat() {

        seats++;
        System.out.println("New seat added.");

        notify();
    }
}

class Student extends Thread {

    CourseRegistr course;
    String studentName;

    Student(CourseRegistr course, String studentName) {
        this.course = course;
        this.studentName = studentName;
    }

    public void run() {
        course.register(studentName);
    }
}

class Admin extends Thread {

    CourseRegistr course;

    Admin(CourseRegistr course) {
        this.course = course;
    }

    public void run() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        course.addSeat();
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        CourseRegistr course =
                new CourseRegistr();

        Student student =
                new Student(course, name);

        Admin admin =
                new Admin(course);

        student.start();
        admin.start();

        sc.close();
    }
}