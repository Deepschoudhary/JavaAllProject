package Dynamic_input_user;

import constructor.Person;

public class Student extends Person {
    private int rollno;

    // Constructor
    public Student(int rollno, String firstName, String lastName, int age, String address, String country, String state, String city, String zipcode) {
        super(firstName, lastName, age, address, country, state, city, zipcode);
        this.rollno = rollno;
    }
    public int getRollno() {
        return rollno;
    }
    // Getters and setters...
}