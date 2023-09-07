/*3. Grade Calculator: Create an application that takes 
a student's test scores and calculates their final grade. 
Use conditional statements to determine the
 letter grade (e.g. A, B, C, etc.) based on their scores.*/
import java.util.Scanner;

public class Grade{

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
  System.out.println("enter sub1 scores");
  int sub1 = sc.nextInt();
 System.out.println("enter sub2 scores");
  int sub2 = sc.nextInt();
   System.out.println("enter sub3 scores");
  int sub3 = sc.nextInt();
    int total_score;
    total_score =(sub1+sub2+sub3)/3;
    if(total_score>=70){
      System.out.println("A");
    }
    else if (total_score>=60){
      System.out.println("B");
    }
    else if(total_score>=50){
      System.out.println("c");
    }
    else if(total_score<50){
      System.out.println("fail");
    }
  }
}
    
    
