//Write a java program to reverse the array elements.
import java.util.Scanner;
public class Reversearray{
  public static void main(String[]args){
    int temp,j,i;
    Scanner s=new Scanner(System.in);
    System.out.println("enter the range of array");
      int n=s.nextInt();
     int a[]=new int[n];
  System.out.println("enter the array elements");
    for(i=0;i<n;i++)
      a[i]=s.nextInt();
      for(j=0;j<n/2;j++){
        temp=a[j];
        a[j]=a[n-j-1];
        a[n-j-1]=temp;
      }
      System.out.println("the reverse elements of array");
    for(j=0;j<n;j++){
    System.out.println(a[j]);
    }
  }
}
