//32. Write a JAVAprogram to enter a number and print its reverse.

import java.util.*;
public class Reverse{
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter any number");
    int n=sc.nextInt();
    int digit=0,rev=0;
    while (n>0){
      digit=n%10;
      rev=(rev*10)+digit;
      n=n/10;
     
    }
      System.out.println("Reverse of digits in given number is"+rev);
   
  }
}