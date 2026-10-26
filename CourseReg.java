class Course {

    String studentName;
    String courseName;
    Course(String sName, String cName) {
        studentName = sName;
        courseName = cName;
    }
    void display() {
        System.out.println("Student Name : " + studentName);
        System.out.println("Course Name  : " + courseName);
    }
}

public class CourseReg {

    public static void main(String[] args) {

        Course c1 = new Course("Netra", "Java Programming");
        System.out.println("Course Registration System");
        System.out.println("--------------------------");

        c1.display();
    }
}
