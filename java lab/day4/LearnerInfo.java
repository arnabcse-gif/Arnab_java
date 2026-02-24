class LearnerInfo {

    int roll;
    String name;

    LearnerInfo(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        LearnerInfo s = (LearnerInfo) obj;

        return (roll == s.roll && name.equals(s.name));
    }
}

class CompareTest {
    public static void main(String[] args) {

        LearnerInfo s1 = new LearnerInfo(101, "Arnab");
        LearnerInfo s2 = new LearnerInfo(101, "Arnab");

        if (s1.equals(s2))
            System.out.println("Objects are equal");
        else
            System.out.println("Objects are not equal");
    }
}