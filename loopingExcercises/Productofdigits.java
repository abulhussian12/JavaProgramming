//31. Write a JAVAprogram to calculate product of digits of a number.

import java.util.*;
public class Productsofdigits{
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter any number");
    int n=sc.nextInt();
    int digit=0,sum=1;
    while (n>0){
      digit=n%10;
      n=n/10;
      sum=sum*digit;
    }
      System.out.println("Product of digits in given number is"+sum);
   
  }
}