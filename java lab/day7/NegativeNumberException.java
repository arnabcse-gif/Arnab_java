import java.util.Scanner;

class NegativeNumberException extends Exception {

    NegativeNumberException(String msg) {
        super(msg);
    }
}

 class ProcessInputDemo {

    static void processInput(int num) throws NegativeNumberException {

        if(num < 0) {
            throw new NegativeNumberException("number should be positive");
        }

        System.out.println("Double value: " + (num * 2));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        try {

            processInput(n);

        }
        catch(NegativeNumberException e) {

            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }
    }
}