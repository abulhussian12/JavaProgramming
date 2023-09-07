//Write a Java program to find the index of an array element.
import java.util.*;
public class IndexArray
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Declare the array size");
      int n=s.nextInt();
      int i,j;
      int a[]=new int[n];
      System.out.println("Enter the array elements");
      for(i=0;i<n;i++)
        a[i]=s.nextInt();
      
      System.out.println("enter the array value to find index");
        int b=s.nextInt();
      for(i=0;i<n;i++)
      if(a[i]==b){
              System.out.println(i);

        }
        }
  }
  