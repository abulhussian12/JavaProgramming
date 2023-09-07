//67. Write a JAVAprogram to count total number of words in a string.
import java.util.Scanner;
public class NumberofWord{
public static void main(String[]args){
  int count=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a string value");
  String s=new String();
   s=sc.nextLine();
  System.out.println("given string value "+s);
 String a[]=s.split(" ");
  for(int i=0;i<a.length;i++){
    System.out.println(""+a[i]);
    count++; 
  }
  System.out.println("number of words in given string  " +count);
  } 
}
