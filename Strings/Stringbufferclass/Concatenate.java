//Write a Java program to concatenate a given string to the end of another string
import java.util.Scanner;
public class Concatenate{
  public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
   String s=new String();
    s=sc.nextLine();
     StringBuffer a1=new StringBuffer(s);
    System.out.println("enter the string to  add ");
    String s1=new String();
    s1=sc.next();
    System.out.println(a1.append(s1));
  }
}