//16. Write a JAVAprogram to print day of week name using switch case.
import java.util.Scanner;
public class Switch_Week{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter week number");
   int no=sc.nextInt();
    switch (no){
      case 1:
      System.out.println("Monday");
  break;
    case 2:
      System.out.println("Tuesday");
    break;
      case 3:
      System.out.println("Wedsday");
    break;
      case 4:
      System.out.println("Thrusday");
    break;
      case 5:
      System.out.println("Friday");
    break;
      case 6:
      System.out.println("Saturday");
        break;
      case 7:
      System.out.println("Sunday");
    break;
    }
    
}
}