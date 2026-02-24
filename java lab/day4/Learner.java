abstract class Learner {
    int rollNo;
    long regNo;

    void getinput(int r, long reg) {
        rollNo = r;
        regNo = reg;
    }

    abstract void course();
}

class KiitStudent extends Learner {

    @Override
    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }

    void display() {
        System.out.println("Rollno - " + rollNo);
        System.out.println("Registration no - " + regNo);
        course();
    }
}

class AbstractDemo {
    public static void main(String[] args) {

        KiitStudent k = new KiitStudent();

        k.getinput(2205180, 1234567890L);
        k.display();
    }
}