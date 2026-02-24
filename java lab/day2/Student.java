import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;

    void read(Scanner sc) {
        System.out.print("Enter Roll: ");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter CGPA: ");
        cgpa = sc.nextDouble();
    }

    void display() {
        System.out.println(roll + " " + name + " " + cgpa);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];
        double lowest = 10;
        String lowName = "";

        for(int i = 0; i < n; i++) {
            s[i] = new Student();
            s[i].read(sc);

            if(s[i].cgpa < lowest) {
                lowest = s[i].cgpa;
                lowName = s[i].name;
            }
        }

        System.out.println("\nStudent Details:");
        for(int i = 0; i < n; i++)
            s[i].display();

        System.out.println("Student with Lowest CGPA: " + lowName);
        sc.close();
    }
}
