import java.util.*;
abstract class shape
{
  abstract void numberOfSides( );
}
  
class Rectangle extends shape
{
  void numberOfSides( )
  {
    System.out.println("the number of sides in rectangle is 4");
  }
}
class Triangle extends shape
{
 void numberOfSides( )
  {
    System.out.println("the number of sides in triangle is 3");
  }

}
class Hexagon extends shape
{
  void numberOfSides( )
  {
    System.out.println("the number of sides in hexagon is 6");
  }
}
class shapeside
{
 public static void main(String args[])
 {
   Rectangle ob1 = new Rectangle();
   Triangle ob2 = new  Triangle();
   Hexagon ob3 = new Hexagon();
   ob1.numberOfSides( );
   ob2.numberOfSides( );
   ob3.numberOfSides( );
 }
 }
     
