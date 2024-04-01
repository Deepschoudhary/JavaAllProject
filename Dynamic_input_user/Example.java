package Dynamic_input_user;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = scanner.next();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.next();

        System.out.print("Enter Rollno: ");
        int rollno = scanner.nextInt();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Address: ");
        String address = scanner.next();

        System.out.print("Enter Country: ");
        String country = scanner.next();

        System.out.print("Enter State: ");
        String state = scanner.next();

        System.out.print("Enter City: ");
        String city = scanner.next();

        System.out.print("Enter Zipcode: ");
        String zipcode = scanner.next();

        // Creating a Student object with dynamic input
        Student s1 = new Student(rollno, firstName, lastName, age, address, country, state, city, zipcode);


        System.out.println("\nStudent Details:");
        System.out.println("Rollno: " + s1.getRollno());
        System.out.println("First Name: " + s1.getFirstName());
        System.out.println("Last Name: " + s1.getLastName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Address: " + s1.getAddress());
        System.out.println("Country: " + s1.getCountry());
        System.out.println("State: " + s1.getState());
        System.out.println("City: " + s1.getCity());
        System.out.println("Zipcode: " + s1.getZipcode());

        // Close the scanner
        scanner.close();
    }
}
