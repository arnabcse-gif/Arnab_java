class Abc
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        System.out.print("Enter Registration No: ");
        long reg = sc.nextLong();

        Kiitian k = new Kiitian();
        k.getInput(roll, reg);
        k.display();
    }
}