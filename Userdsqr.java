import java.io.*;
import java.util.Scanner;

class InvalidNumberFormatException extends Exception
{
InvalidNumberFormatException(String str)
{
super(str);
}
}
class Userdsqr
{
public static void main(String args[])
{
try
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number to square");
int n=sc.nextInt();
if(n<0)
throw new InvalidNumberFormatException("not possible");
else
System.out.println("square is"+n*n);
}
catch(InvalidNumberFormatException infe)
{
System.out.println(infe);
}
}
}
