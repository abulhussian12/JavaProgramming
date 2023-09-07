//Write a Java program to get the character at the given index within the String

import java.util.Scanner;
public class Getcharatindex{
public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a string value");
  String s=new String();
   s=sc.nextLine();
  System.out.println("given string value "+s);
 // for (int i=0;i<s.length();i++)
  System.out.println("enter the index value");
  int i=sc.nextInt();
  System.out.println("the given index value "+ i + "the value at given index is " + s.charAt(i));
 
  }
  }
