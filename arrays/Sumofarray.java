//Write a java program to find the sum of all array element

import java.util.*;
public class Sumofarray
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Declare the array size");
      int n=s.nextInt();
      int sum=0;
      int a[]=new int[n];
      System.out.println("Enter the array elements");
      for(int i=0;i<n;i++)
          {    
         a[i]=s.nextInt();
           sum=sum+a[i]; 
            }
      System.out.println(sum);
    }
  }