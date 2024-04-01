package FIle_Output_Strream;
import java.io.*;
public class FileExample {
    public static void main(String[] args) throws IOException{
        int i;
        FileOutputStream fout =new FileOutputStream("D:\\Java_practice\\Resources/dilip.txt", true);
        String s= "TATA";
        char ch[] =s.toCharArray();
        for(i=0; i<s.length(); i++)
            fout.write(ch[i]);
        fout.close();
    }
}

