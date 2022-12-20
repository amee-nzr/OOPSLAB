import java.io.*;
import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a string");
String s=sc.nextLine();
int l=s.length();
String rev="";
for(int i=l-1;i>=0;i--)
{
rev=rev+s.charAt(i);
}
if( rev.equals(s))
System.out.println(s+"is a palindrome");
}
}

