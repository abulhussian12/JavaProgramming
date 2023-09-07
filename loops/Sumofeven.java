//Write a java program to find sum of all even numbers between 1 to n.
import java.util.Scanner;
public class Sumofeven {
  public static void main(String args[]) {
    Scanner s =new Scanner(System.in);
System.out.println("Enter the n value");
   int n = s.nextInt();
    int i,sum=0;
  if(n>0){
    for(i=2;i<=n;i=i+2)
      {
        sum=sum+i;
       
      }
     System.out.println(sum);
  }
  }
}