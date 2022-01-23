class Employee
{
  void display()
  {
   System.out.println("Name of class is Employee");
  }
  void calcSalary()
  {
    System.out.println("Salary of employee is 10000");
  }
}
class Engineer extends Employee
{
  void display()
  {
   System.out.println("Name of class is Engineer");
   super.display();
  }
  void calcSalary()
  {
     System.out.println("Salary of employee is 20000");
     super.calcSalary();
  }
  public static void main(String args[])
  {
   Engineer obj = new Engineer();
   obj.display();
   obj.calcSalary();
  }
   
}
