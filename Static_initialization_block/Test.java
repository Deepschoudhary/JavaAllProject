package Static_initialization_block;

public class Test {
    private static int k;
    static {
        System.out.println("Static_initialization_block:k="+k);
        k=10;

    }
    public static void main(String []args)
    {
        new Test();
    }
}
