//Write a Java program to find the common elements between two arrays

import java.util.*;
public class CommonArray
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Declare the array1 size");
      int n=s.nextInt();
      System.out.println("Declare the array2 size");
      int n1=s.nextInt();
      int i,j,c,d;
      int a[]=new int[n];
      int b[]=new int[n1];
      System.out.println("Enter the array elements");
      for(i=0;i<n;i++){
        a[i]=s.nextInt();
      }
       System.out.println("Enter the array elements");
      for(i=0;i<n1;i++){
        b[i]=s.nextInt();
      }
      for(c=0;c<n;c++){
      for(d=0;d<n;d++){
        if(a[c]==a[d]){
          System.out.println("the common elements are");
          System.out.println(a[c]);
        }
      }
      }
    }
  }
    
  