import reverse.ReverseNum;
import java.util.Scanner;
class RevDemo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
ReverseNum i=new ReverseNum();
i.rev(n);
}
}

