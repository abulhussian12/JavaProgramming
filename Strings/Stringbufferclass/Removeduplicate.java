//Write a java program to remove all duplicates from a given string?
import java.util.Scanner;
public class Removeduplicate{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a sring value");
    String s=sc.nextLine();
   StringBuffer a=new StringBuffer(s);
 String x=a.toString();
    char arr[]=x.toCharArray();
    for(int i=0;i<x.length();i++){
      for(int j=i+1;j<x.length();j++){
        if( arr[i]==arr[j]){
      a.deleteCharAt(j);
        }
      }
    }
    System.out.println("After removing duplicate elments");
    System.out.println(a);
    
    
    
      
    }
   // System.out.println("enter the pattern to find");
}

