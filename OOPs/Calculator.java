/*Create a class calculator that will perform any arithmetic operations over two variables.  Build menu based application like:

Addition
Subtract
Multiplication
Division
Remainder

Write a main class that promotes user to create ‘n’ objects , for each object allow the user to choose one of the operation.*/
import java.util.Scanner;
class Calculator{
   Scanner s=new Scanner(System.in);
  int a,b;
  void read(){
  System.out.println("Enter a values ");
    a=s.nextInt();
    b=s.nextInt();
  }
  void Addition(){
    System.out.println("given 1st  value "+a+"2nd value is "+ b + "after adding two values "+a+b);
  }
  void Subtraction(){
    System.out.println("given 1st  value "+a+"2nd value is "+ b + "after a two values" + (a-b));
}
void Multiplication(){
    System.out.println("given 1st  value "+a+"2nd value is "+ b + "after multiply two values "+a*b);
}
void Division(){
    System.out.println("given 1st  value "+a+"2nd value is "+ b + "after dividing two values "+a/b);
}

//public class Calculator{
  public static void main(String[]args){
    Scanner t=new Scanner(System.in);
    System.out.println("Enter to operations to perform");
    int n=t.nextInt();
    Calculator c[]=new Calculator[n];
    for(int i=0;i<n;i++)
    
     c[i]=new Calculator();
    
      
    for(int r=0;r<n;r++){
      c[r].read();
      System.out.println("enter option to perfom 1.addition, 2.subtraction,3.multiplication,4.division ");
      int f =t.nextInt();
      switch(f){
        case '1':
      c[r].Addition();
          break;
          case'2':
      c[r].Subtraction();
          break;
        case '3':
      c[r].Multiplication();
          break;
          case'4':
      c[r].Division();
          break;
        default:
          System.out.println("Enter valid number");
      }
    }
    
    
  }
} 