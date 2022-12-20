import java.util.Scanner;
class Frequency
{
public static void main(String args[])
{
int count=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a string");
String s=sc.nextLine();
System.out.println("enter a character");
char c=sc.next().charAt(0);
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)==c)
count++;
}
System.out.println("count is"+count);
}
}
