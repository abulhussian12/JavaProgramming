//26. Write a JAVAprogram to count number of digits in a number.
import java.util.*;
public class Countdigits{
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter any number");
    int n=sc.nextInt();
    int digit=0,count=0;
    while (n>0){
      digit=n%10;
      n=n/10;
      count++;
    }
      System.out.println("no of digits in given number is"+count);
   
  }
}