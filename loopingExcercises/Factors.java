//37. Write a JAVAprogram to find all factors of a number.
import java.util.*;
public class Factors{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number ");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
      if(n%i==0){
       System.out.println("the factors of number is "+i);
      }
    }
     
  }
}