package Generic_methods;

public class Example2 {
    public <E> void printArray(E[] s){
        for( E x:s)
            System.out.println(x);

    }
//    public void printArray(int []n){
//        for (int i = 0; i < n.length; i++)
//            System.out.println(n[i]);
//
//    }

    public static void main(String[] args) {
        Example2 e1=new Example2();

        String countries[]=new String[]{"India","USA", "UK"};
        Integer[] numbers ={12,13,34,55};
        e1.printArray(countries);
        e1.printArray(numbers);

    }
}
