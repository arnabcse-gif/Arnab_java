import java.util.Scanner;

abstract class Student
{
    int rollNo;
    long regNo;

    void getInput(int r, long reg)
    {
        rollNo = r;
        regNo = reg;
    }

    abstract void course();
}


