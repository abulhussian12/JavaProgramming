

import java.util.Scanner;

public class SumofNtoone {

  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    int n,i,sum=0;
    System.out.println("enter the value of n");
    n = s.nextInt();
     i=n;
    while(i>=1)
      {
        i--;
       sum=sum+i;
      }
     System.out.println(sum);
  }
  
}