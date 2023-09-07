import java.util.Scanner;
class Grandtest{
  long hallticketno;
  private String answersmarks;
  static int questionno;
  void result()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the hallticketno");
    hallticketno=sc.nextLong();
    result=pass;
    answersmarks=50;
    
  }
  public class Grade{
  public static void main(String[]args){
    Grandtest user1=new Grandtest();
    Grandtest user2 =new Grandtest();
    user1.hallticketno=2233456;
     user2.hallticketno=2255456;
    user1.result();
    user2.result();
  }
  
}
}