//Write a java program to reverse a given String
import java.util.Scanner;
public class reversestring {
 public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a string1");
   String s=sc.nextLine();
   StringBuffer sb= new StringBuffer(s);
   System.out.println(sb.reverse());
   

    
    
  }
}