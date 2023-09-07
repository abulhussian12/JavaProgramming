//39. Write a JAVAprogram to check whether a number is Prime number or not.
import java.util.*;
public class Prime{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    boolean temp=true;
  for(int i=2;i<n;i++){
    if(i%n==0){
      temp=false;
    }
  }
    if(temp!=false){
    System.out.println("given number is prime ");
    }
    else {
       System.out.println("given number is not a prime ");
    }
  }
}