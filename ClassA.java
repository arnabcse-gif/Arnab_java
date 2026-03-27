

public class ClassA {
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30; // package-private
    private int privateVar = 40;

    public void display() {
        System.out.println("Inside ClassA");
    }
}