package This_Super;

class ExampleA {
    int y; // Make z accessible to the subclasses

    public void f1() {
        y = 10;
        System.out.println("Value of y: " + y);
    }
}

class B extends ExampleA {

    int z; // Declare y here to make it accessible in f2

    public void f2() {
        z = 5;
        System.out.println("Value of z: " + z);
    }

    public void f1() {
        y = 10; // Initialize y in class B
        z = 5;
        int d = y + z;
        System.out.println("Result " + d);
        super.f1(); // Call f1 of the superclass
    }
}

class Example {
    public static void main(String[] args) {
        B obj = new B();
        obj.f1();
        obj.f2();
    }
}
