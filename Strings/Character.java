//Write a java program to find number of characters in a given string.


import java.util.Scanner;
public class Character{
public static void main(String[]args){
  int count=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a string value");
  String s=new String();
   s=sc.nextLine();
  System.out.println("given string value "+s);
  for (int i=0;i<s.length();i++){
    System.out.println(s.charAt(i));
    count++;
    
  }
  System.out.println("number of characters in given string  " +count);
  } 
}