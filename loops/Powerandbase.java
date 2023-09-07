//Write a program that calculates the power of a number. Take two inputs from the user, the base number and the exponent, and calculate the result using a loop.



import java.util.*;
class Powerandbase {
    public static void main(String[] args) {
      long base, exponent;
      Scanner s=new Scanner(System.in);
      base=s.nextLong();
      exponent=s.nextLong();
      long power=1;
      int j=1;
      do
      {
       power=power *base;
          j=j+1;
      }
      while(j<=exponent);
      System.out.println(power);
    }
}