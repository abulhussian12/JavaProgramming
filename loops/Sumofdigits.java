//Write a java program to calculate sum of digits of a number.
import java.util.Scanner;

public class Sumofdigits {

  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    int number,digit,sum=0;
    System.out.println("enter the number ");
    number = s.nextInt();
    while(number>0)
    {
      digit=number%10;
      number=number/10;
     sum=sum+digit;
    }  
      System.out.println(sum + "the sum of digits in number");
  }
}
    