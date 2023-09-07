import java.util.Scanner;
class Exception1{
  Scanner sc=new Scanner(System.in);
  int a,b,c;
  void division(){
    try{
    System.out.println("Enter the values of a and b");
    a=sc.nextInt();
    b=sc.nextInt();
    c=(a/b);
      System.out.println(c);
    }
      
   catch (Exception e)
           {
      System.out.println("errror:exception "+e.getMessage());
    }
    finally {
      System.out.println("the division process");
    }
  }
}
public class Example {
  public static void main(String[]args){
    Exception1 ec=new Exception1();
    ec.division();
    
  }
}