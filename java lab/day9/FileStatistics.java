import java.io.*;
import java.util.Scanner;

public class FileStatistics {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String file = sc.nextLine();

        BufferedReader br = new BufferedReader(new FileReader(file));

        int characters = 0;
        int words = 0;
        int lines = 0;

        String line;

        while((line = br.readLine()) != null) {

            lines++;

            characters += line.length();

            String w[] = line.split("\\s+");

            words += w.length;
        }

        br.close();

        System.out.println("No. of characters - " + characters);
        System.out.println("No. of lines - " + lines);
        System.out.println("No. of words - " + words);
    }
}