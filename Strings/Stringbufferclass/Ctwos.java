//Write a Java program to compare two strings lexicographically
//Write a Java program to compare a given string to another string, ignoring case considerations
import java.util.Scanner;
public class Ctwos{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string1");
    String s1=sc.nextLine();
    //for(int i=0;i<s.length();i++);
     //String a[]=new String(s);
    System.out.println("enter a string2");
    String s2=sc.nextLine();
    System.out.println("comparing two strings lexicographically");
    System.out.println(s1.equals(s2));
    System.out.println("comparing two strings equalsignore case;");
    System.out.println(s1.equalsIgnoreCase(s2));
    
   
    
  }
}