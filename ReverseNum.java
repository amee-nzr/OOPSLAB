package reverse;
import java.io.*;
public class ReverseNum
{
public void rev(int n)
{
int rev=0;
while(n>0)
{
int r=n%10;
n=n/10;
rev=(rev*10)+r;
}
System.out.println("rev is"+rev);
}
}
