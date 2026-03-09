import java.util.Scanner;

interface Salary {

    double earnings(double basic);
    double deductions(double basic);
    double bonus(double basic);
}

abstract class Manager implements Salary {

    public double earnings(double basic) {

        double da = 0.80 * basic;
        double hra = 0.15 * basic;

        return basic + da + hra;
    }

    public double deductions(double basic) {

        return 0.12 * basic;
    }
}

class Substaff extends Manager {

    public double bonus(double basic) {

        return 0.50 * basic;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        Substaff s = new Substaff();

        System.out.println("Earnings - " + s.earnings(basic));
        System.out.println("Deduction - " + s.deductions(basic));
        System.out.println("Bonus - " + s.bonus(basic));
    }
}