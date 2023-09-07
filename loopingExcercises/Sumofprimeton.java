//41. Write a JAVAprogram to find sum of all prime numbers between 1 to n.
import java.util.*;
public class Sumofprimeton{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    int sum=0;
  for(int i=1;i<=n;i++){
      int count=0;
    for(int j=1;j<i;j++){
      if(i%j==0){
      count++;
      }
       
      }
     if (count==2){
       sum=sum+i;
    }
     
  }
  System.out.println("the sum of primenumber beteen 1 to n is "+sum);
   
  }
}