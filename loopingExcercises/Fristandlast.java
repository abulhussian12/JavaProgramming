//27. Write a JAVAprogram to find first and last digit of a number.
import java.util.*;
public class Fristandlast{
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter any number");
    int n=sc.nextInt();
    int digit=0,count=0;
    digit=n%10;
    while (n>=10){
      n/=10;
      
    }
    count=n;
      System.out.println("firstdigit is"+digit);
   System.out.println("lastdigit is"+count);
  }
}