//46. Write a JAVAprogram to print all Perfect numbers between 1 to n.
import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
   
   int sum=0;
  for(int i=1;i<n;i++){
      //int m=i;
      for (int j=1;j<i;j++)
    if(i%j==0){
        sum=sum+j;
  }
  if(sum==i){
       System.out.println(i+"is a Perfect number");
   }
  }
  }
}
