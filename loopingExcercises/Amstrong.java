//43. Write a JAVAprogram to check whether a number is Armstrong number or not.
import java.util.*;
public class Amstrong{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
   int m=n;
   int digit=0,amn=0,sum=0;
   while (n>0){
       digit=n%10;
       n/=10;
        amn=digit*digit*digit;
      sum=sum+amn; 
   }
   if(sum==m){
       System.out.println("Number is amstrong number");
   }
  }
   
  }
