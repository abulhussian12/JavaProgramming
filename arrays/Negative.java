//Write a java program to count the total number of negative elements in an array.
import java.util.*;
public class Negative
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Declare the array size");
      int n=s.nextInt();
      int sum=0,count=0;
      int a[]=new int[n];
      System.out.println("Enter the array elements");
      for(int i=0;i<n;i++){
        a[i]=s.nextInt();
        if(a[i]<0){
          count=count+1;
        }
      }
      System.out.println(count +"count of negative elementsin a array");
        }
  }
        