import java.util.Scanner;

public class ArrayExceptionDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[4];

        System.out.println("Enter 5 numbers:");

        try {
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt(); // Exception occurs when i = 4
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException:4");
        }

        sc.close();
    }
}
