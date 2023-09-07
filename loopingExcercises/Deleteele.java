//56. Write a JAVAprogram to delete an element from an array at specified position.
import java.util.*;
public class Deleteele{
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
         System.out.println(arr[i]+" the array  before delete Elements"); 
    }
    System.out.println("Enter the index number to delet the element");
    int no=sc.nextInt();
    for (int j=no+1;j<=n-1-no;j++){
        arr[j-1]=arr[j];
        }
        for(int j=0;j<n-1;j++){
        System.out.println(arr[j]+" after deleting the array Elements");  
        }
    }
    
}

