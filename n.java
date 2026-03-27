
class a extends Thread 
{
public void run()
{
for(int i = 0; i<1000; i++)
System.out.println("class a i="+i);
}
}
class b extends Thread
{
public void run()
{
for(int i = 0; i<1000; i++)
System.out.println("class b i="+i);
}
}

class n
{
public static void main(String[] args)
{
a a1= new a();
b b1= new b();
a1.start();
b1.start();
}
}


