//11. Write a JAVAprogram to input week number and print week day.

import java.util.Scanner;
public class Week{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter week number");
   int no=sc.nextInt();
    if (no==1){
      System.out.println("Monday");
  }
    else if(no==2){
      System.out.println("Tuesday");
    }
    else if(no==3){
      System.out.println("Wedsday");
    }
    else if(no==4){
      System.out.println("Thrusday");
    }
    else if(no==5){
      System.out.println("Friday");
    }
    else if(no==6){
      System.out.println("Saturday");
    }
    else if(no==7){
      System.out.println("Sunday");
    }
}
}