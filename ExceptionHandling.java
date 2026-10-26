
import java.util.Scanner;

class InvalidRegisterException extends Exception
{
    InvalidRegisterException(String msg)
    {
        super(msg);
    }
}

public class ExceptionHandling
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.println("Enter Student Name:");
            String name = sc.nextLine();

            System.out.println("Enter Register Number:");
            int regNo = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Course Name:");
            String course = sc.nextLine();

            if (regNo <= 0)
            {
                throw new InvalidRegisterException(
                    "Invalid Register Number!"
                );
            }

            System.out.println("===================================");
            System.out.println("       COURSE REGISTRATION");
            System.out.println("===================================");
            System.out.println("Student Name : " + name);
            System.out.println("Register No  : " + regNo);
            System.out.println("Course Name  : " + course);
            System.out.println("Registration : Successful");
        }
        catch (InvalidRegisterException e)
        {
            System.out.println("Registration Failed: " + e.getMessage());
        }

        sc.close();
    }
}