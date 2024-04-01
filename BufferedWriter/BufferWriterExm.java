package BufferedWriter;
import java.io.*;

public class BufferWriterExm {
    public static void main(String[] args) throws IOException{
        BufferedWriter bf = new BufferedWriter(new FileWriter ("D:\\Java_practice\\Resources\\dilip.txt", true));
        bf.write(" Computer");
        bf.close();
    }
}
