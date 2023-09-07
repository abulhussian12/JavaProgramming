//Write a java program to copy all elements from one array to another array.

import java.util.*;
public class CopyArray
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Declare the array size");
      int n=s.nextInt();
      int i,j;
      int a[]=new int[n];
      System.out.println("Enter the array elements");
      for( i=0;i<n;i++)
        a[i]=s.nextInt();
      int a1[]=new int[n];
      for( j=0;j<n;j++){
        a1[j]=a[j];
      }
        System.out.println("the copied elements in the new array");
    for(i=0;i<n;i++)
      System.out.println(a1[i]);


      
      }

    
    }
  
