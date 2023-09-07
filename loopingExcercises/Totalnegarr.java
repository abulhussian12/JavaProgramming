//54. Write a JAVAprogram to count total number of negative elements in an array.
import java.util.*;
public class Totalnegarr{
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
    int count=0;
    for(int i=0;i<n;i++){
        if(arr[i]<0){
          count++;
             
        }
    }
   System.out.println(count+" the total negative array Elements");

}


}