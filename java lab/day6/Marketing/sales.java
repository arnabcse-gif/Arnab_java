package Marketing;

import General.employee;
import java.util.Scanner;

public class sales extends employee {

    public double tallowance(double earn) {

        return 0.05 * earn;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        sales s = new sales();

        System.out.print("Enter employee id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        s.getData(id, name);

        double earn = s.earnings(basic);

        System.out.println("The emp id of the employee is " + s.empid);
        System.out.println("The total earning is " + earn);
    }
}