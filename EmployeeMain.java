import java.util.*;
class Employee
{
  String Name,Address;
  int Age, Phone_number,Salary;
 void printSalary( )
  {
    System.out.println("Salary of the Employee "+Name+" is "+Salary);
  }
}
class Officer extends Employee
{
 String specialization;
}

 
class Manager extends Employee
{
  String department;
}  
class EmployeeMain
{
 public static void main(String args[])
 {
  Scanner ob = new Scanner(System.in);
  Officer ob1 = new Officer();
  Manager ob2 = new Manager();
  System.out.println("enter the name of the officer");
  ob1.Name = ob.next();
  System.out.println("enter the age of the officer");
  ob1.Age = ob.nextInt();
  System.out.println("enter the phone number of the officer");
  ob1.Phone_number = ob.nextInt();
  System.out.println("enter the address of the officer");
  ob1.Address = ob.next();
  System.out.println("enter the salary of the officer"); 
  ob1.Salary = ob.nextInt();
  System.out.println("enter the specialization of the officer");
  ob1.specialization = ob.next(); 
  System.out.println("enter the name of the Manager");
  ob2.Name = ob.next();
  System.out.println("enter the age of the Manager");
  ob2.Age = ob.nextInt();
  System.out.println("enter the phone number of the Manager");
  ob2.Phone_number = ob.nextInt();
  System.out.println("enter the address of the Manager");
  ob2.Address = ob.next();
  System.out.println("enter the salary of the Manager"); 
  ob2.Salary = ob.nextInt();
  System.out.println("enter the department of the officer");
  ob2.department = ob.next();
  System.out.println("Name of the officer:"+ob1.Name+" age:"+ob1.Age+" phone number:"+ob1.Phone_number+" address:"+ob1.Address+" specialization:"+ob1.specialization);
  ob1.printSalary();
  System.out.println("Name of the Manager:"+ob2.Name+" age:"+ob2.Age+" phone number:"+ob2.Phone_number+" address:"+ob2.Address+" department:"+ob2.department);
  ob2.printSalary();
  }
}
