
//52. Write a JAVAprogram to find maximum and minimum element in an array. 

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
      int maxele=arr[0],minele=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]>maxele){
            maxele=arr[i];
           
        }
        else if (arr[i]<minele){
            minele=arr[i];
        }
    }
    System.out.println( maxele+" the   maxmimum array Element");
      System.out.println( minele+" the   minimum array Element");

}


}
