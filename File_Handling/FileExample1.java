package File_Handling;
import java.io.File;
import java.io.IOException;

public class FileExample1 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\Java_practice\\Resources/dilip.txt");
        f1.createNewFile();
        System.out.println("Is exist:"+f1.exists());
        System.out.println("File Size:"+f1.length());
        System.out.println("Can file read :"+f1.canWrite());
        System.out.println("File Name:"+f1.getName());
        System.out.println("File Delete:"+f1.delete());


    }
}
