//40. Write a JAVAprogram to print all Prime numbers between 1 to n.
import java.util.*;
public class Primenumbers1ton{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    
  for(int i=1;i<=n;i++){
      int count=0;
    for(int j=1;j<i;j++){
      if(i%j==0){
      count++;
      }
       
      }
     if (count==2){
       System.out.println("the primenumber beteen 1 to n is "+i); 
      
    }
  }
   
  }
}