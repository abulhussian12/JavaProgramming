//59. Write a JAVAprogram to count total number of duplicate elements in an array.
import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array size");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the array Elements");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
         System.out.println(arr[i]+" the array  Elements"); 
    }
   int count=0;
    for(int i=0;i<n;i++){
    for (int j=i+1;j<=n;j++){
        if(arr[i]==arr[j])
        {
            count++;
             
        }
      
    }
      System.out.println(count+"  the total duplicate Elements in  the array Elements");
    }
    
    
      
    }
    
}
