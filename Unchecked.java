public class Unchecked {
    public static void main(String[] args) {
        try {
            System.out.println(3/0);
            System.out.println("in try");
        }catch (ArithmeticException e){
            System.out.println("Exception:"+e.getMessage());
        }
        System.out.println("Hello");
        System.out.println("new all file crete ");
    }
}
