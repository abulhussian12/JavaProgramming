
//4. Write a JAVAprogram to check whether a number is divisible by 5 and 11 or not.
import java .util.Scanner;
class Checknum{
  public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any  number");
    int a=sc.nextInt();
   // int b=sc.nextInt();
    if(a%5==0 && a%11==0){
      System.out.println("number is divisble by 5 and 11");
    }
    else{
      System.out.println("number is not divisble by 5 and 11");
    } 
  }
}
      
      
      