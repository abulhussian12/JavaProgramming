/*13. Write a JAVAprogram to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:

Percentage >= 90% : Grade A

Percentage >= 80% : Grade B

Percentage >= 70% : Grade C

Percentage >= 60% : Grade D

Percentage >= 40% : Grade E

Percentage < 40% : Grade F*/
import java.util.Scanner;
public class Marks{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter five subjects marks");
    System.out.println("Enter Physics marks");
   int Physics=sc.nextInt();
    System.out.println("Enter Chemistry marks");
   int Chemistry=sc.nextInt();
    System.out.println("Enter Biology marks");
   int Biology=sc.nextInt();
    System.out.println("Enter Mathematics marks");
   int Mathematics=sc.nextInt();
    System.out.println("Enter Computer marks");
   int Computer=sc.nextInt();
    int totalmarks=(Physics+Chemistry+Biology+Mathematics+Computer);
    double percentage=(totalmarks/5)*100;
    if (percentage==90){
      System.out.println("Grade A");
  }
    else if(percentage==80){
      System.out.println("Grade B");
    }
    else if(percentage==70){
      System.out.println("Grade C");
    }
    else if(percentage==60){
      System.out.println("Grade D");
    }
    else if(percentage==40){
      System.out.println("Grade E");
    }
    else if(percentage>40){
      System.out.println("Fail");
    }
   // else if(no==7){
      //System.out.println("Sunday");
    //}
}
}