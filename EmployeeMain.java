/*


import java.io.*;
class Employee
{
String name;
int age;
String address;
float salary;
long ph;

void printSalary()
{
System.out.println("Salary is"+10000);
}
}

class Officer extends Employee
{
String specialization;



Officer(String n,int a,String ad,float s,long p)
{
n=name;
a=age;
ad=address;
p=ph;
}



void display()
{
System.out.println("Name"+name);
System.out.println("Age"+age);
System.out.println("Address"+address);
System.out.println("Phone"+ph);
}
}
class Manager extends Employee
{
String Department;

Manager(String n,int a,String ad,float s,long p)
{
n=name;
a=age;
ad=address;
p=ph;
}

void display()
{
System.out.println("Name"+name);
System.out.println("Age"+age);
System.out.println("Address"+address);
System.out.println("Phone"+ph);
}
}

class EmployeeMain
{
public static void main(String args[])
{
Employee e = new Employee();
Officer o = new Officer("Ameena",20,"KS PURAM",5600,8909067545L);
Manager m = new Manager("Iman",23,"EKM",4500,9067845657L);
e.printSalary();
o.display();
m.display();
}
}

*/


class Employee{
    String Name;
    int Age;
    int PhoneNumber;
    String Address;
    int Salary;
    Employee(String Name,int Age,int PhoneNumber,String Address,int Salary){
        this.Name= Name;
        this.Age=Age;
        this.PhoneNumber=PhoneNumber;
        this.Address=Address;
        this.Salary=Salary;
    }
    void printSalary(){
        System.out.println("Salary is "+ this.Salary);
        System.out.println("Age is "+ this.Age);
        System.out.println("Name is "+ this.Name);
    }

}
class Officer extends Employee{
    String specialization;
    Officer(String Name,int Age,int PhoneNumber,String Address,int Salary,String specialization){
        super(Name, Age, PhoneNumber, Address, Salary);
        this.specialization=specialization;
    }
}
class Manager extends Employee{
    String department;
    Manager(String Name,int Age,int PhoneNumber,String Address,int Salary,String department){
        super(Name,Age,PhoneNumber,Address,Salary);
        this.department=department;
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Officer A = new Officer("XY",32,234567,"AB street",40000,"AI");
        Manager B = new Manager("YX",54,2345432,"BA street",60000,"Accounting");
        A.printSalary();
        B.printSalary();

    }
}










