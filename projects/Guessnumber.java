/*Number Guesser: Create a number guessing game where the computer generates a random number and the user has to guess it. 
if user Guess is incorrect, then give hints (weather the actual number is less than/ greater than guess number).*/

import java.util.Scanner;
public class Guessnumber{
  public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int number = 1 +(int) (1000*Math.random());
    System.out.println("guess the number with in 10 trials");
    int guessnumber =s.nextInt();
    if(number!=guessnumber){
    int t=10;
    for(int i=0;i<t;i++)
   } 
   else if(number==guessnumber){
      System.out.println("congratulations you gussed the number");
    }
    else if(number<guessnumber){
      System.out.println("guess number is less than "); 
    }
   else if(number>guessnumber){
     System.out.println("guess number is greater than"); 
    }
    else 
     System.out.println("out of moves!");
    }
  }
}
