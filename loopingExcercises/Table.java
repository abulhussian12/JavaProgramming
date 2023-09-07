//Write a java program to print multiplication table of any number.
import java.util.Scanner;

public class Table {

  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    int number,digit ,i;
    System.out.println("enter the number ");
    number = s.nextInt();
    if(number>0){
    for(i=1;i<=10;i++)
      {
        digit=number*i;
        System.out.println( number +"*" +i+"=" + digit);
      }
    }
  }
}