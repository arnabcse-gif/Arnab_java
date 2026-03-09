import java.io.*;

public class CompareBinaryFiles {

    public static void main(String[] args) throws IOException {

        FileInputStream f1 = new FileInputStream("file1.bin");
        FileInputStream f2 = new FileInputStream("file2.bin");

        int b1, b2;
        int pos = 1;
        boolean equal = true;

        while(true) {

            b1 = f1.read();
            b2 = f2.read();

            if(b1 != b2) {
                equal = false;
                System.out.println("Two files are not equal: byte position at which two files differ is " + pos);
                break;
            }

            if(b1 == -1 || b2 == -1)
                break;

            pos++;
        }

        if(equal)
            System.out.println("Two files are equal");

        f1.close();
        f2.close();
    }
}