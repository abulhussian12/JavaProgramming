import java.util.Scanner;

public class Factorial {

  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    int n,fact=1,k;
    System.out.println("enter the value of n ");
    n = s.nextInt();
    if(n>0){
      k=1;
      while(k<=n){
        fact=fact*k;
        k=k+1; 
      }
      System.out.println(fact);
        
    }
  }
}
  
