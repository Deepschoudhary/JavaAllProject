package hellon;

public class Example {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setFirstName("Dilip");
        s1.setLastName("Choudhary");
        s1.setAge(18);
        s1.setRollno(99);
        s1.setAddress("Mansower");
        s1.setCountry("India");
        s1.setState("Raj");
        s1.setCity("Jaipur");
        s1.setZipcode(9090);

        System.out.println("First Name: " + s1.getFirstName());
        System.out.println("Last Name: " + s1.getLastName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Rollno: " + s1.getRollno());
        System.out.println("Address: " + s1.getAddress());
        System.out.println("Country: " + s1.getCountry());
        System.out.println("State: " + s1.getState());
        System.out.println("City: " + s1.getCity());
        System.out.println("Zipcode: " + s1.getZipcode());
    }
}

