import java.util.Scanner;

class CourseRegis extends Thread {

    String studentName;
    String courseName;

    CourseRegis(String studentName, String courseName) {
        this.studentName = studentName;
        this.courseName = courseName;
    }

    public void run() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Registration Successful!\n");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String student = sc.nextLine();

        System.out.print("Enter Course 1: ");
        String course1 = sc.nextLine();

        System.out.print("Enter Course 2: ");
        String course2 = sc.nextLine();

        CourseRegis t1 =
            new CourseRegis(student, course1);

        CourseRegis t2 =
            new CourseRegis(student, course2);

        t1.start();
        t2.start();

        sc.close();
    }
}