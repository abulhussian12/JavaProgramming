//Write a java program to count number of digits in a number.
import java.util.Scanner;

public class Digits {

  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    int number,digit,count=0;
    System.out.println("enter the number ");
    number = s.nextInt();
    while(number>0)
    {
      digit=number%10;
      number=number/10;
      count++;
    }  
      System.out.println(count + "the no.of digits in number");
    
  }
}