import java.io.*;
import java.util.Scanner;
class FileWrite
{
public static void main(String args[])
{
try
{
File f=new File("hello.txt");
if(f.createNewFile())
System.out.println("Successfully created");
else
System.out.println("Failed to create new file");

FileWriter fw=new FileWriter(f);
fw.write("Hello\nHow are you?\nI'm fine");
fw.close();
Scanner sc=new Scanner(f);
while(sc.hasNextLine())
{
String s=sc.nextLine();
System.out.println(s);
}
}
catch(IOException ioe)
{
System.out.print(ioe);
}
}
}

