import java.io.*;
interface printable
 {
  void print();
 }
interface showable
 {
  void show();
 }
class A implements printable,showable
 {
  public void print()
   {
    System.out.println("HELLO");
   }
 
public void show()
   {
    System.out.println("HI");
   }
}
class InterfaceMain
 {
  public static void main(String args[])
  {
   A a=new A();
   a.print();
   a.show();
  }
 }

