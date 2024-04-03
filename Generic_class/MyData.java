package Generic_class;

class MyData1<U> {
    U i;

    public void add(U i1) {
        i = i1;
    }

    public U get() {
        return (i);
    }
}
    public class MyData {
        public static void main(String[] args) {
            MyData1<Integer> m1 = new MyData1<>();
            MyData1<String> m2 = new MyData1<>();
            Integer k = new Integer(5);
            m1.add(k);
            m2.add("deeps");
            System.out.println("m1=" + m1.get() + " m2=" + m2.get());
        }
    }

