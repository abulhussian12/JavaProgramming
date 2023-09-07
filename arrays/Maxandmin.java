//Write a Java program to find the maximum and minimum elements in an array.

import java.util.*;

 

public class Maxandmin
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Declare the array size");
      int n=s.nextInt();
      int a[]=new int[n];
      System.out.println("Enter the array elements");
      for(int i=0;i<n;i++)
          {  
         a[i]=s.nextInt();
          }
       int minvalue=a[0];
        int maxvalue=a[0];
        for(int j=0;j<n;j++){
          if(a[j]>maxvalue){
            maxvalue=a[j];
              }
          else if(a[j]<minvalue){
            minvalue=a[j];
              }
        }
      System.out.println(minvalue);
      System.out.println(maxvalue);
    }
  }
      
    
      
      
        
        
       