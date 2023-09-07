//Write a java program to find sum of all odd numbers between 1 to n.
import java.util.Scanner;
public class Sumofodd {
  public static void main(String args[]) {
    Scanner s =new Scanner(System.in);
System.out.println("Enter the n value");
   int n = s.nextInt();
    int i,sum=0;
  if(n>0){
    for(i=1;i<=n;i=i+2)
      {
        sum=sum+i;
       
      }
     System.out.println(sum);
  }
  }
}