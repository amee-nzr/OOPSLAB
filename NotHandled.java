import java.io.*;

class NotHandled
{
public static void main(String args[])
{
try
{
int a=50/0;
System.out.println("hi");
System.out.print(a);
}catch(NullPointerException npe)
{
System.out.println(npe);
}
finally
{
System.out.println("finally block");
}
System.out.println("hello");
}
}
