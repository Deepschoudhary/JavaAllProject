import java.io.*;

public class Throws_in_Checked {
    public static void main(String[] args) throws IOException {
        try {
            throw new IOException();
//        System.out.println("After Exception");
        } catch (IOException e) {
            System.out.println("Exception:"+e.getMessage());
        }

    }
}


//   Throwable
// Error     Exception
// IOException   ClassNotFoundException    RunTimeException
//illegalArgumentException     NullPointerException       ArithmeticException
// NumberFormatException