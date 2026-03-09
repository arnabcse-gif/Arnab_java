class Bank {

    double principal = 10000;

    static class InterestCalculator {

        static double calculateInterest(double p, double r, double t) {

            return (p * r * t) / 100;
        }
    }

    public static void main(String[] args) {

        double si = InterestCalculator.calculateInterest(10000, 5, 2);

        System.out.println("Simple Interest = " + si);

    }
}