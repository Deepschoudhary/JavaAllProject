package BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//public class BufferedReaderExm {
//    public static void main(String[] args) throws IOException {
//        int ch;
//        BufferedReader bf = new BufferedReader(new FileReader("D:\\Java_practice\\Resources\\dilip.txt"));
//        while ((ch =bf.read())!=-1){
//            System.out.print((char) ch);
//        }
//        bf.close();
//    }
//}


// all line read code


//public class BufferedReaderExm {
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader bf = new BufferedReader(new FileReader("D:\\Java_practice\\Resources\\dilip.txt"));
//
//        String s1;
//        s1=bf.readLine();
//        while ((s1=bf.readLine())!=null)
//            System.out.println(s1);
//        bf.close();
//    }
//}


public class BufferedReaderExm {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new FileReader("D:\\Java_practice\\Resources\\dilip.txt"));
        char[] s = new char[20];
        bf.read(s, 0, 4);

        System.out.println(s);
        bf.close();
    }

}
