import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
   
   int amn=0,sum=0;
   for(int i=1;i<=n;i++){
      // int m=i;
        amn=i*i*i;
      sum=sum+amn; 
     if(sum==i){
       System.out.println(i+" is amstrong number from 1 to "+n);
   }
   }
    
   
  }
   
  }
