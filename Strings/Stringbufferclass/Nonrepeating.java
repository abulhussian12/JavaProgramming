//Write a java program to find the first non-repeating character in a given String
import java.util.Scanner;
public class Nonrepeating{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int j;
    System.out.println("enter a sring value");
    String s=sc.nextLine();
   StringBuffer a=new StringBuffer(s);
 String x=a.toString();
    char arr[]=x.toCharArray();
    for(int i=0;i<x.length();i++){
      for( j=i+1;j<x.length();j++){
        if( arr[i]!=arr[j]){
       //a.deleteCharAt(j);
          //System.out.println(arr[j]);
        }
      }
    }
     
    
   // System.out.println("After removing duplicate elments");
    System.out.println(arr[j]);
    
    
    
      
    }

}

