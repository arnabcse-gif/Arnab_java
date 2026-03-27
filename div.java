import java.util.*;
class div
{
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
try{
 int num1, num2, result;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

 result=num1/num2;
if(num2==3)
throw new ArithmeticException ("error");
System.out.println("Division = " + result);
}
catch(ArithmeticException e)
{
System.out.println("0 dia vag jai na");
}
finally
{
System.out.print("Thanks");
}

}
}