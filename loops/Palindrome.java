//Write a java program to check whether a number is palindrome or not.
import java.util.Scanner;

public class Palindrome {

  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    System.out.println("enter the number");
    int number =s.nextInt();
    int digit,rev=0,temp;
    temp=number;
      while(number>0){
        digit=number%10;
        rev=(rev*10)+digit;
        number=number/10;
    }
    if(rev==temp){
      System.out.println("number is palindrome");
    }
  else {
    System.out.println("number is not a palindrome");
  }
  }
}
  


