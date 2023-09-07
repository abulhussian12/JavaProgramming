//30. Write a JAVAprogram to calculate sum of digits of a number.

import java.util.*;
public class Sumofdigits{
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter any number");
    int n=sc.nextInt();
    int digit=0,sum=0;
    while (n>0){
      digit=n%10;
      n=n/10;
      sum=sum+digit;
    }
      System.out.println("sum of digits in given number is"+sum);
   
  }
}
