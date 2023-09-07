//Write a java program to display first  & last character of every word in a given string.
import java.util.Scanner;
public class Firstandlastchar{
public static void main(String[]args){
  int count=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a string value");
  String s=new String();
   s=sc.nextLine();
  System.out.println("given string value "+s);
  String a[]=s.split(" ");
  System.out.println("displaying first and last characters of given string");
  for (int i=0;i<a.length;i++){
     System.out.println(" "+a[i].charAt(0));
    System.out.println(" "+a[i].split(" "));
   }
  }
}