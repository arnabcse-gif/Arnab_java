class RectangleArea {
    double length, breadth;

    // Default constructor
    RectangleArea() {
        length = 0;
        breadth = 0;
    }

    // Parameterized constructor
    RectangleArea(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        RectangleArea r1 = new RectangleArea();
        RectangleArea r2 = new RectangleArea(10, 5);

        System.out.println("Area using default constructor: " + r1.area());
        System.out.println("Area using parameterized constructor: " + r2.area());
    }
}