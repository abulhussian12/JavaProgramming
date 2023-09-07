/*Create a class named Calculator that contains the following methods:
add(int a, int b): Returns the sum of two numbers.
subtract(int a, int b): Returns the result of subtracting the second number from the first.
multiply(int a, int b): Returns the product of two numbers.
divide(int a, int b): Returns the result of dividing the first number by the second.
Implement a Main class that demonstrates the functionality of the Calculator class. In the main method:
Create an instance of Calculator.
Prompt the user to enter two integers.
Call each of the calculator methods and handle any exceptions that might occur:
Handle division by zero (ArithmeticException) in the divide method.
Handle any other invalid input (InputMismatchException) when reading user input.
Use separate catch blocks to handle each type of exception that might be thrown.
Display the result of each operation or an appropriate error message if an exception occurred.
Ensure that your application continues to execute after handling exceptions and provides a clear message at the end of the process*/
import java.util.*;
class Cal
  {
    Scanner sc=new Scanner(System.in);
    int a,b,c;
    Cal()
    {
      a=0;
      b=0;
      c=0;
      /*try{
      System.out.println("enter a,b values");
      a=sc.nextInt();
      b=sc.nextInt();
      }
      catch(InputMismatchException ime)
        {
          System.out.println("error is:input mis match "+ime.getMessage());
        }*/
    }
    void add()
    {
      try
        {System.out.println("enter a,b values");
      a=sc.nextInt();
      b=sc.nextInt();
          c=a+b;
          System.out.println("addition of a,b is: "+c);
        }
      catch(InputMismatchException ime)
        {
          System.out.println("error is: "+ime.getMessage());
        }
       
    }
    void sub()
    {
      try
        {
          System.out.println("enter a,b values");
      a=sc.nextInt();
      b=sc.nextInt();
          c=a-b;
          System.out.println("subtraction of a,b is: "+c);
        }
      catch(InputMismatchException ime)
        {
          System.out.println("error is: "+ime.getMessage());
        }
      
    }
    void multiply()
    {
      try
        {
          System.out.println("enter a,b values");
      a=sc.nextInt();
      b=sc.nextInt();
          c=a*b;
          System.out.println("multiplication of a,b is: "+c);
        }
      catch(InputMismatchException ime)
        {
          System.out.println("error is: "+ime.getMessage());
        }
    }
    void div()
    {
      try
        {
          System.out.println("enter a,b values");
      a=sc.nextInt();
      b=sc.nextInt();
          c=a/b;
          System.out.println("division of a,b is: "+c);
        }
      catch(InputMismatchException ime)
        {
          System.out.println("error is: "+ime.getMessage());
        }
      catch(ArithmeticException ae)
        {
          System.out.println("error is :"+ae.getMessage());
        }
    }
    
  }
public class Calculator{
public static void main(String []args){
  Cal c=new Cal();
  c.add();
  c.sub();
  c.multiply();
  c.div();
}
}

