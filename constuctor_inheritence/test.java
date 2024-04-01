package constuctor_inheritence;

//public class test {
//    // Static variable
//    static int count = 0;
//
//    // Instance variable
//    int instanceCount;
//
//    // Constructor
//    public test() {
//        // Increment count for each object created
//        count++;
//        // Set instanceCount for each object
//        instanceCount = count;
//    }
//
//    // Static method to access static variable
//    public static int getCount() {
//        return count;
//    }
//
//    public static void main(String[] args) {
//        // Creating objects of Example class
//        test obj1 = new test();
//        test obj2 = new test();
//        test obj3 = new test();
//        test obj4 = new test();
//
//        // Accessing static variable using class name
//        System.out.println("Total objects created: " + test.getCount());
//
//        // Accessing instance variable
//        System.out.println("Instance count for obj1: " + obj1.instanceCount);
//        System.out.println("Instance count for obj2: " + obj2.instanceCount);
//        System.out.println("Instance count for obj3: " + obj3.instanceCount);
//        System.out.println("Instance count for obj3: " + obj4.instanceCount);
//    }
//}

public class test {
    static int Age=18;
    static String Name="dilip";
    static int RollNo=16;
    public static void main(String[] args)
    {

        System.out.println("Age"+" "+test.Age);
        System.out.println("Name"+" "+test.Name);
        System.out.println("RollNo"+" "+test.RollNo);
    }
}
