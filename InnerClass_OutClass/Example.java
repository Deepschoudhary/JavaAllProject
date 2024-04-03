package InnerClass_OutClass;


class Outer {
    static int x = 10;
    static class Inner{
        void if1(){
            System.out.println("if1()" + x);
        }
    }
}
public class Example{
    public static void main(String[] args) {
        //Outer out =new Outer();
        Outer.Inner o1= new Outer.Inner();
        o1.if1();
    }
}
