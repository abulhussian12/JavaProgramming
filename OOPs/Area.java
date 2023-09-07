//. Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its constructor and having a method named 'returnArea' which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
import java.util.Scanner;
class Rectangle{
  int length;
  int breadth;
  int area;
Scanner s= new Scanner(System.in);
 Rectangle(){
  
  System.out.println("enter the length of rectangle");
   length=s.nextInt();
  System.out.println("enter the breadth of rectangle");
   breadth=s.nextInt();
  
}
}
class Returnarea extends Rectangle{
  void Returnarea(){
     area=(length*breadth);
    System.out.println(" the area of rectangle "+ area);
  }
}
  public class Area{
    public static void main(String []args){
     //Rectangle r =new Rectangle();
      Returnarea ra=new Returnarea();
     // r.Rectangle();
      ra.Returnarea();
    }
  }
  
  
