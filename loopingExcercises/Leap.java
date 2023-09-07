//6. Write a JAVAprogram to check whether a year is leap year or not.
import java.util.Scanner;
public class Leap{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter year");
   int year=sc.nextInt();
    if (year%400==0||year%4==0 && year%100!=0){
      System.out.println("Given year is Leap year");
  }
    else{
      System.out.println("Given year is not a leap year");
    }
}
}