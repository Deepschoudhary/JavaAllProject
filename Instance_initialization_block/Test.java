package Instance_initialization_block;

public class Test {
    private String x;

    {
        x="5";
        System.out.println("initialization block:x="+x);

    }
    public Test()
    {
        System.out.println("Constructor:x="+ x );
    }
    public static void main(String []args){
        Test t1=new Test();
        Test t2=new Test();
    }

}
