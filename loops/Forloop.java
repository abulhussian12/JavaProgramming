import java.util.Scanner;

public class Forloop {

  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    int number,digit,sum=0;
    System.out.println("enter the number above 725 ");
    number = s.nextInt();
    int i;
    if(number>725){
      for(i=5;i<=number;i=i*5){
        System.out.println(i);
      }
    }
    else{
      System.out.println("enter the number value greater than 725");
    }
  }
}
    