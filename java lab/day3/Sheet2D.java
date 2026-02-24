import java.util.Scanner;

class Sheet2D {
    double length, width;

    void input2D(Scanner sc) {
        System.out.print("Enter length of sheet: ");
        length = sc.nextDouble();
        System.out.print("Enter width of sheet: ");
        width = sc.nextDouble();
    }

    double calculateCost2D() {
        double area = length * width;
        return area * 40;   // Rs 40 per sq ft
    }
}

class Box3D extends Sheet2D {
    double height;

    void input3D(Scanner sc) {
        input2D(sc);
        System.out.print("Enter height of box: ");
        height = sc.nextDouble();
    }

    double calculateCost3D() {
        double volume = length * width * height;
        return volume * 60;   // Rs 60 per cubic ft
    }
}

class PlasticDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Box3D obj = new Box3D();

        System.out.println("---- 2D Sheet ----");
        obj.input2D(sc);
        System.out.println("Cost of Sheet = Rs " + obj.calculateCost2D());

        System.out.println("\n---- 3D Box ----");
        obj.input3D(sc);
        System.out.println("Cost of Box = Rs " + obj.calculateCost3D());

        sc.close();
    }
}