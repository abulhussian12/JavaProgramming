//Write a Java program to convert all the characters in a string to uppercase
import java.util.Scanner;
public class Converttoupper{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a sring value");
    String s=sc.nextLine();
   // StringBuffer a= new StringBuffer(s);
    System.out.println(s.toUpperCase());
 }
}