package FileInputStream;

import java.io.*;

public class FileInputStreamExm {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream f1s = new FileInputStream("D:\\Java_practice\\Resources\\dilip.txt");
        do {
            i = f1s.read();
            if(i!=-1)
                System.out.print((char) i);
        } while (i != -1);
        f1s.close();
    }
}
