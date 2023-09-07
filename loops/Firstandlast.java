//Write a java program to find first and last digit of a number.
import java.util.Scanner;

public class Firstandlast {

  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    int n,firstdigit,lastdigit;
    System.out.println("enter the number ");
    n = s.nextInt();
    int digit;
    while(n>10);
    {
      n=n/10;
           System.out.println(n +"firstdigit");
    }      

       
   }
  }



    