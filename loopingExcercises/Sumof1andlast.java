//28. Write a JAVAprogram to find sum of first and last digit of a number.
import java.util.*;
public class Sumof1andlast{
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter any number");
    int n=sc.nextInt();
    int digit=0,count=0,sum=0;
    digit=n%10;
    while (n>=10){
      n/=10; 
    }
    count=n;
    sum=count+digit;
      System.out.println("sum of firstdigit and lastdigit is"+sum);
  
  }
}