package Instance_initialization_block;

public class method {
    int i;
    int j;

    public method(int k, int x) {
        i = k;
        j = x;
    }

    public method() {
    }

    public static void main(String[] args) {
        String s = "dilip";
        System.out.println(s.toUpperCase());
        int a = 10;
        int b= 15;
        method m1 = new method(5,6);
        System.out.println("i:"+ m1.i);
        int z = m1.add(a,b);
        System.out.println(z);
    }

    private int add(int i, int b) {
        int z = i+b;
        return z;
    }
}
