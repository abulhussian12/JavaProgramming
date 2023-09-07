//55. Write a JAVAprogram to copy all elements from an array to another array.
import java.util.*;
public class Copyarr{
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
    for (int j=0;j<n;j++){
        System.out.println(arr[j]+" the copied array Elements");  
    }
    
}


}