//12. Write a JAVAprogram to count total number of notes in given amount.
import java.util.Scanner;
public class Notes{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter  amount");
   int amount=sc.nextInt();
    int rem=0,quo=0;
    if (amount>2000){
     rem=amount/2000;
      amount=amount%2000;
      System.out.println(rem);
  }
    else if(amount>1000){
      rem=amount/1000;
      System.out.println(rem);
    }
    else if(amount>500){
      rem=amount/500;
      
      System.out.println(rem);
    }
    else if(amount>200){
      rem=amount/200;
      System.out.println(rem);
    }
    else if(amount>100){
      rem=amount/100;
      System.out.println(rem);
    }
    else if(amount>50){
      rem=amount/50;
      System.out.println(rem);
    }
    else if(amount>20){
      rem=amount/20;
      System.out.println(rem);
    }
     else if(amount>10){
      rem=amount/10;
      System.out.println(rem);
    }
}
}