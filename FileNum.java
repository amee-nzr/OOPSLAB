import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
class FileNum
{
public static void main(String args[])
{
int sum=0;
try
{
File f=new File("SUM.txt");
f.createNewFile();
FileWriter fw=new FileWriter(f);
fw.write("100 350");
fw.close();
Scanner sc=new Scanner(f);
while(sc.hasNextLine())
{
String s=sc.nextLine();
StringTokenizer st=new StringTokenizer(s);
while(st.hasMoreTokens())
{
  int a=Integer.parseInt(st.nextToken());
  sum=sum+a;
  
  }
  System.out.println("sum is "+sum);
  }
  }
  catch(IOException ioe)
  {
  System.out.print(ioe);
  }
  }
  }
