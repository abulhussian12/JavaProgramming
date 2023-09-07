//36. Write a JAVAprogram to find power of a number using for loop.
import java.util.Scanner;
public class Powerofnumber{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the base");
    int base=sc.nextInt();
    System.out.println("Enter the Exponent");
    int Exponent=sc.nextInt();
    int result=1;
    for(int i=0;i<Exponent;i++){
      result=result*base;
    }
    System.out.println("Result is "+result);
    
  }
}