//29. Write a JAVAprogram to check whether a number is palindrome or not.
import java.util.*;
public class Palindrome{
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter any number");
    int n=sc.nextInt();
    int digit=0,count=0,rev=0;
   int m=n;
    while (n>0){
       digit=n%10;
          rev=(rev*10)+digit;
      n/=10;
    
    }
    if(rev==m){
      System.out.println("Given number is palindrome");
    }
    else{
       System.out.println("Given number is not a palindrome");
    }
    
      
  
  }
}