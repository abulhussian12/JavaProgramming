/*Write a java program to print all natural numbers from 1 to n. - using while loop
*/



import java.util.Scanner;

public class Oneton {

  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    int n,i;
    System.out.println("enter the value of n");
    n = s.nextInt();
     i=1;
    while(i<=n)
      {
        i++;
        System.out.println(i);
      }
  }
}