package BufferedWriter;
import java.io.*;

//public class BufferWriterExm {
//    public static void main(String[] args) throws IOException{
//        BufferedWriter bf = new BufferedWriter(new FileWriter ("D:\\Java_practice\\Resources\\dilip.txt", true));
//        bf.write(" Computer");
//        bf.close();
//    }
//}
public class BufferWriterExm {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\Java_practice\\Resources\\ram.txt", true);
        BufferedWriter bf = new BufferedWriter(fw);
        bf.write("NEW");
        bf.close();

    }

}