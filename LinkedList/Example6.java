package LinkedList;

import java.util.LinkedList;

class Example6{
     public static void main(String[] args) {
         LinkedList list=new LinkedList();
         list.addFirst("dilip");
         list.addLast("Choudhary");
         System.out.println(list.getFirst());
         System.out.println(list.getLast());
     }
}
