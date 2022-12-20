import java.io.*;
class Complex
{
int real,image;
public Complex(int r,int i)
{
this.real=r;
this.image=i;
}
public void showC()
{
System.out.println(this.real+" +i"+this.image);
}
public complex add(Complex,Complex);
}
