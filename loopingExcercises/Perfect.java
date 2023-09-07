//45. Write a JAVAprogram to check whether a number is Perfect number or not.
import java.util.*;
public class Perfect{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
   int m=n;
   int digit=0,amn=0,sum=0;
  for(int i=1;i<n;i++){
    if(n%i==0){
        if(n!=i){
        sum=sum+i;
    }
  }
  }
   if(sum==m){
       System.out.println("Number is Perfect number");
   }
   else {
     System.out.println("Number is not a Perfect number");  
   }
  
   
  }
}