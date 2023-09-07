//68. Write a JAVAprogram to find reverse of a string.
import java.util.Scanner;
public class ReverseString{
public static void main(String[]args){
  int count=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a string value");
 String s=sc.nextLine();
  System.out.println("given string value "+s);
  StringBuffer sb=new StringBuffer(s);
  System.out.println("reverse of given string is "+sb.reverse());

  } 
}
