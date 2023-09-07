/*
Write a java program to print all natural numbers in reverse (from n to 1). -    using while loop

*/



import java.util.Scanner;

public class Ntoone {

  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    int n,i;
    System.out.println("enter the value of n");
    n = s.nextInt();
     i=n;
    while(i>=1)
      {
        i--;
        System.out.println(i);
      }
  }
}