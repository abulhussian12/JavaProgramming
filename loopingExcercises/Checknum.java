import java .util.Scanner;
class Checknum{
  public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any  number");
    int a=sc.nextInt();
   // int b=sc.nextInt();
    if(a>0){
      System.out.println("the given value a is "+a+"positive number");
    }
    else if (a==0){
      System.out.println("the given value are a is "+a+"is equal to zero");
      else if (a<0){
       System.out.println("the given value are a is "+a+"is negative number ");
      }
    }
   
  }
}