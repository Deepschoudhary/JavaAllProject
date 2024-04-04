package Collection_List_ArrayList;
import java.util.*;
public class Example5 {
    public static void main(String[] args) {
        ArrayList l1=new ArrayList(4);
        l1.add("ajay");
        l1.add("Dilip");
        l1.add(2,"deeps");
        l1.add("syam");
        l1.add("vikash");
        l1.add("happy");
        Iterator it=l1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
