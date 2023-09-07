//Write a java program to find maximum between three numbers.




import java.util.Scanner;

public class Biggest_numbers3 {

  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    int num1, num2,num3;
    System.out.println("enter the value of num1");
    num1 = s.nextInt();
    System.out.println("enter the value of num2");
    num2 = s.nextInt();
    System.out.println("enter the value of num3");
    num3 = s.nextInt();
    if (num1 < num2) {
      System.out.println("num2 is greatear");
    } 
    else if (num1>num3){
      System.out.println("num1 is greatear");
    }
    else if(num2<num3){
      System.out.println("num3 is greatear");
    }
    else  {
      System.out.println("num2 is greatear");
    }
    }
      
    }