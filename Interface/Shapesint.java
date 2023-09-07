/*Create an interface named Shape with the following methods:
calculateArea(): A method that calculates and returns the area of the shape.
calculatePerimeter(): A method that calculates and returns the perimeter of the shape.
Implement two classes that represent different shapes: a) Circle: Implement the Shape interface for circles. Include a constructor that takes the radius as a parameter. Implement the calculateArea and calculatePerimeter methods for circles. b) Rectangle: Implement the Shape interface for rectangles. Include a constructor that takes the length and width as parameters. Implement the calculateArea and calculatePerimeter methods for rectangles.
In the Main class, create instances of both Circle and Rectangle. Test each shape's calculation methods by calculating and printing their areas and perimeters.*/

interface Shape{
    public void calculateArea(double radius) ;
    public void calculatePerimeter(double radius);
       public void calculateArea(double length,double breadth) ;
    public void calculatePerimeter(double length,double breadth); 
  
     
}
class Circle implements Shape {
  
    public void calculateArea(double radius){
     // radius=20;
    double area=(3.147*radius*radius);
    System.out.println("The area of circle is :"+area);
    }
     public void calculatePerimeter(double radius){
       //radius =24;
    double perimeter=(2*radius*3.147);
    System.out.println("The perimeter of circle is :"+perimeter);
    
    }
}
class Rectangle implements Shape{

    public void calculateArea(double length,double breadth){
    double area=(length*breadth);
    System.out.println("The area of Recatngle is :"+area);
    }
     public void calculatePerimeter(){
    double perimeter=(2*(length+breadth));
    System.out.println("The perimeter of Recatngle is :"+perimeter);
    
    }
}
public class Shapesint{
    public static void main(String[]args){
        Circle c=new Circle();
        c.calculateArea(20);
        c.calculatePerimeter(24);
        Rectangle r=new Rectangle();
        r.calculateArea(12,10);
        r.calculatePerimeter(8,7);
    }
}