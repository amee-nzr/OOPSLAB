import java.io.*;
import java.util.Scanner;

class InvalidAgeException extends Exception
{
InvalidAgeException(String str)
{
super(str);
}
}
class UserDefinedException
{
public static void main(String args[])
{
try
{
Scanner sc=new Scanner(System.in);
System.out.println("enter age");
int a=sc.nextInt();
if(a<18)
throw new InvalidAgeException("not eligible");
else
System.out.println("eligible");
}
catch(InvalidAgeException iae)
{
System.out.println(iae);
}
}
}
