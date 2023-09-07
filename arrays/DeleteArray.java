//Write a java program to delete an element from an array at a specified position.

import java.util.*;

 

class DeleteArray
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Declare the array size");
      int n=s.nextInt();
      int a[]=new int[n];
      System.out.println("Enter the array elements");
      for(int i=0;i<n-1;i++)
        {
          a[i]=s.nextInt();
        }
      System.out.println("The elements of the array is: ");
      for(int i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
    
      System.out.println("Enter the position to delete data");
      int b=s.nextInt();
      for(int i=b+1;i<=n-1-b;i++)
        {
          a[i-1]=a[i];
        }
      System.out.println("The array after deleting element is:");
      for(int i=0;i<n-1;i++)
      System.out.println(a[i]);

    }
  }
