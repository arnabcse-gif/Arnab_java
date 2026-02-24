import java.util.Scanner;

class Plate {
    double length, width;

    Plate(double l, double w) {
        length = l;
        width = w;
        System.out.println("Plate Constructor Called");
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
    }
}

class Carton extends Plate {
    double height;

    Carton(double l, double w, double h) {
        super(l, w);
        height = h;
        System.out.println("Carton Constructor Called");
        System.out.println("Height = " + height);
    }
}

class WoodCarton extends Carton {
    double thick;

    WoodCarton(double l, double w, double h, double t) {
        super(l, w, h);
        thick = t;
        System.out.println("WoodCarton Constructor Called");
        System.out.println("Thickness = " + thick);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        System.out.print("Enter thickness: ");
        double t = sc.nextDouble();

        WoodCarton obj = new WoodCarton(l, w, h, t);

        sc.close();
    }
}