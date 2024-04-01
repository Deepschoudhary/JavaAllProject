package Test;

//public class ExampleTest {
//    public static void main(String[] args) {
//        String s1 ="Dilip";
//        String s2 ="Dilip";
//        String s3 =new String ("Dilip");
//        System.out.println("Result1:"+(s1==s2));//
//        System.out.println("Result2:"+s1.equals(s2));
//        System.out.println("Result3:"+(s1==s3));
//        System.out.println("Result4:"+s1.equals(s3));
//
//    }
//}
public class ExampleTest {
    public static void main(String[] args) {
        String s1= new String("Computer");
        System.out.println(s1);
        String s2=s1.toUpperCase();
        System.out.println(s2);
        s2=s1.toLowerCase();
        System.out.println(s2);

    }
}