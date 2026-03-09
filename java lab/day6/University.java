class University {

    String universityName = "KIIT University";
    String location = "Bhubaneswar";

    class Department {

        String deptName = "Computer Science";
        String hodName = "Dr. Sharma";

        void display() {

            System.out.println("University: " + universityName);
            System.out.println("Location: " + location);
            System.out.println("Department: " + deptName);
            System.out.println("HOD: " + hodName);

        }
    }

    public static void main(String[] args) {

        University u = new University();

        University.Department d = u.new Department();

        d.display();

    }
}