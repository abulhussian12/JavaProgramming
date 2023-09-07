 //Write a java program to count the total number of even and odd elements in an array.
import java.util.*;
public class EvenandoddArray
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
        if(a[i]%2==0){
          sum=sum+1;
        }
        else if(a[i]%2!=0){
          count=count+1;
        }
      }
      System.out.println(sum +" the count of all even numbers");
      System.out.println(count +"the count of all odd numbers");
    }
  }
        