import java.util.Scanner;

public class Reverse {

  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    System.out.println("enter the number");
    int number =s.nextInt();
    int digit,rev=0;
      while(number>0){
        digit=number%10;
        rev=(rev*10)+digit;
        number=number/10;
    }
    
      System.out.println(rev+"reverse of given number");
    
  }
}
  