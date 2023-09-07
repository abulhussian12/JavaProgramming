import java.util.*;
public class Alternative
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Declare the array size");
      int n=s.nextInt();
      int i,j;
      int a[]=new int[n];
      System.out.println("Enter the array elements");
      for(i=0;i<n;i++){
        a[i]=s.nextInt();
      }
        for(j=0;j<n;j=j+2){
          System.out.println("the alternative elements of a array")
          System.out.println(a[j]);          
        }
      }
    }
  
      
    