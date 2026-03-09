import java.io.*;
import java.util.Scanner;

public class StudentFileDemo {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter file name: ");
        String file = sc.nextLine();

        // Writing to file
        FileWriter fw = new FileWriter(file);
        fw.write("Roll No: " + roll + "\n");
        fw.write("Name: " + name + "\n");
        fw.write("Subject: " + subject + "\n");
        fw.write("Marks: " + marks + "\n");

        fw.close();

        // Reading file
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;

        System.out.println("\nFile Content:");

        while((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}