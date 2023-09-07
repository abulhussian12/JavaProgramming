//Write a java program to capitalize first character of every word in a given string.
import java.util.Scanner;
public class Firstupper{
public static void main(String[]args){
  String count =" ";
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a string value");
  String s=new String();
   s=sc.nextLine();
  System.out.println("given string value "+s);
  String a[]=s.split(" ");
  for (int i=0;i<a.length;i++){
    char c=a[i].charAt(0);
    String sub=a[i].substring(1);
    count=count+String. valueOf(c).toUpperCase()+sub +" ";
     System.out.println( count);
    
   }
  }
}