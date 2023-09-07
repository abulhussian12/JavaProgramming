/*Create a hierarchy of shapes: Shape, Circle, and Rectangle. Each shape should have a method calculateArea() that calculates its area. Override the calculateArea() method in the subclasses to provide specific implementations for circles and rectangles.*/

import java.util.Scanner;
class Shape{
  Scanner sc=new Scanner(System.in);
  int length,breadth;
  double radius,circlearea,rectanglearea;
}
class Circle extends Shape{
  void calculatearea(){
  System.out.println("enter the circle radius");
radius =sc.nextDouble();
circlearea =(2* 3.14*radius*radius);
System.out.println("area of circle is "+circlearea);
  }
}
class Rectangle extends Shape{
  void calculatearea(){
    System.out.println("enter the length and breadth of rectangle");
    length=sc.nextInt();
    breadth=sc.nextInt();
    rectanglearea=(length*breadth);
    System.out.println(" area of rectangle is  "+rectanglearea);
  }
}
public class Shapespoly{
  public static void main(String[]args){
    Shape s=new Shape();
    Circle c=new Circle();
    Rectangle r=new Rectangle();
    Scanner t=new Scanner(System.in);
    System.out.println("enter 1.circle 2.rectangle to calculate area");
    int d=t.nextInt();
    switch(d){
      case 1:
        c.calculatearea();
        break;
      case 2:
        r.calculatearea();
    }
    
  }
}