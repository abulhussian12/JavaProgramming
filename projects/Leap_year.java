
/*4. Leap Year Checker: Create an application that 
takes a year as input and checks if it's a leap year. 
Use conditional statements to determine if the year 
is a leap year based on the rules for determining leap years.*/

import java.util.Scanner;
public class Leap_year{
  public static void main(String[]args) {
   Scanner s=new Scanner (System.in);
    int year;
    System.out.println("enter the year");
    year = s.nextInt();
    if(year%400==0 || year%4==0 && year%100!=0)
    {
      System.out.println("year is  a leap year");
    }
   else
      {
        System.out.println(" year is not leap year");
      }
    }
  }
