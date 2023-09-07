//Write a Java program to create a new String object with the contents of a character array.
import java.util.Scanner;
public class Comparetwostrings {
 public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a string1");
   String s1=sc.nextLine();
   //StringBuffer sb= new StringBuffer(s);
   System.out.println("Enter a string2"); 
   String s2=sc.nextLine();
  System.out.println(s1.CompareTo(s2));

    
    
  }
}