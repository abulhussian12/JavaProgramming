 //Write a JAVAprogram to find maximum between two numbers.
import java .util.Scanner;
class max{
  public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any two numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    if(a>b){
      System.out.println("the given value are a is "+a+"and  b is "+b+"ais greater than b");
    }
    else {
      System.out.println("the given value are a is "+a+"and  b is "+b+"bis greater than a");
    }
   
  }
}
