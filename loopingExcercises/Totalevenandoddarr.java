//53. Write a JAVAprogram to count total number of even and odd elements in an array.
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
         System.out.println(arr[i]+" the array Elements"); 
    }
     int count=0,count1=0;
    for(int i=0;i<n;i++){
        if(arr[i]%2==0){
            count++;
           
        }
        else if (arr[i]%2!=0){
            count1++;
        }
    }
    System.out.println( count+" the   number of even array Element");
      System.out.println( count1+" the   number of odd array Element");

}


}