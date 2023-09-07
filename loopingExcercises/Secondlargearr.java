
//51. Write a JAVAprogram to find second largest element in an array.
import java.util.*;
public class Secondlargearr{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array size");
    int n=sc.nextInt();
    int largestno=0,secondlarge=0;
    int arr[]=new int[n];
    System.out.println("Enter the array Elements");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
         System.out.println(arr[i]+" the array Elements"); 
    }
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++)
        if(arr[i]>arr[j]){
            largestno=arr[i];
           // secondlarge=largestno;
           arr[i]=arr[j];
           arr[j]=largestno;
        }
    }
    System.out.println( arr[n-2]+" the  second largest array Element");
     

}


}
