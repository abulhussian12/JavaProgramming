//69. Write a JAVAprogram to check whether a string is palindrome or not.
import java.util.Scanner;
public class PalindromeString{
public static void main(String[]args){
  int count=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a string value");
 String s=sc.nextLine();
  System.out.println("given string value "+s);
  StringBuffer sb=new StringBuffer(s);
  StringBuffer rev=sb.reverse();
  System.out.println("reverse of given string is "+rev);
  
if(sb==rev){
    System.out.println("Given string is palindrome");
    
}
else {
    System.out.println("Given string is not a palindrome"); 
}
  } 
}
