//Write a JAVAprogram to find length of a string and compare and concatenate two strings.
import java.util.*; 
public class Stringconcat{ 
public static void main(String args[]){ 
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a string1 ");
 String s=sc.next();
 System.out.println("Enter a string1 ");
 String s1=sc.next();
 System.out.println(s.length());
 System.out.println(s1.length());
System.out.println(s.compareTo(s1));
//System.out.println("after comparing"+s2);
String s3=(s+s1);
System.out.println("after concate"+s3);
}
}