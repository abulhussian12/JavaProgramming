//23. Write a JAVAprogram to find sum of all even numbers between 1 to n.
import java.util.Scanner;
public class Sumofeven {

  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    int n,i,sum=0;
    System.out.println("enter the value of n");
    n = s.nextInt();
     i=0;
    while(i<=n)
      {
        i=i+2;
        sum=sum+i;
       
      }
     System.out.println(sum);
  }
}