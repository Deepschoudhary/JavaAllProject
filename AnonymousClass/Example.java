package AnonymousClass;

class Greeting {
    public void sayHello() {
        System.out.println("hello");
    }
}

class India {
    Greeting g = new Greeting() {
        public void sayHello() {
            System.out.println("Namaste");
        }
    };
}

public class Example {
    public static void main(String[] args) {
        India india = new India();
        india.g.sayHello();
    }
}
