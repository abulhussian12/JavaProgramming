//Write a Java program to get the index of a pattern in the given string
import java.util.Scanner;
public class Stringindexof{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a sring value");
    String s=sc.nextLine();
    System.out.println("enter the pattern to find");
    String i=sc.nextLine();
    //StringBuffer b=new StringBuffer(i);
    StringBuffer a= new StringBuffer(s);
    System.out.println(a.indexOf(i));
 }
}