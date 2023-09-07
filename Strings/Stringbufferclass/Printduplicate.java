//Write a java program to print the duplicate characters from the given String
import java.util.Scanner;
public class Printduplicate{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string value");
    String s=sc.nextLine();
    StringBuffer sb=new StringBuffer(s);
    String s1=sb.toString();
    char c[]=s1.toCharArray();
    for(int i=0;i<s1.length();i++){
      for(int j=i+1;j<s1.length();j++){
        if(c[i]==c[j]){
        //sb.deleteCharAt(j);
         System.out.println(sb.charAt(j));
        }
      }
       
    }
  }
}