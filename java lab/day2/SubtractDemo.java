class SubtractDemo {

    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    int subtract(int a, int b, int c) {
        return a - b - c;
    }

    public static void main(String[] args) {
        SubtractDemo obj = new SubtractDemo();

        System.out.println("Subtract int: " + obj.subtract(10, 5));
        System.out.println("Subtract double: " + obj.subtract(10.5, 5.2));
        System.out.println("Subtract three ints: " + obj.subtract(20, 5, 3));
    }
}