interface Motor {

    int capacity = 5;   // data member (constant)

    void run();
    void consume();
}

class WashingMachine implements Motor {

    public void run() {
        System.out.println("Motor is running");
    }

    public void consume() {
        System.out.println("Motor is consuming power");
    }

    public static void main(String[] args) {

        WashingMachine w = new WashingMachine();

        w.run();
        w.consume();

        System.out.println("Capacity of the motor is " + Motor.capacity);
    }
}