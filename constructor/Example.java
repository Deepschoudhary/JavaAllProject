package constructor;

public class Example {
    public static void main(String[] args) {
        Student s1 = new Student(100, "Dilip", "Choudhary", 18, "123 Mansower", "India", "Raj", "Jaipur", "12345");

        System.out.println("Rollno: " + s1.getRollno());
        System.out.println("First Name: " + s1.getFirstName());
        System.out.println("Last Name: " + s1.getLastName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Address: " + s1.getAddress());
        System.out.println("Country: " + s1.getCountry());
        System.out.println("State: " + s1.getState());
        System.out.println("City: " + s1.getCity());
        System.out.println("Zipcode: " + s1.getZipcode());
    }
}

