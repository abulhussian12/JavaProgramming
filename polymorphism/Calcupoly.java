import java.util.Scanner;

class Arithmatic{
  Scanner sc=new Scanner(System.in);
int a,b;
  }
    class Addtion extends Arithmatic{
       //Arithmatic a= Arithmatic();
      //int a=a.retruna();
      void calculate(){
        
        System.out.println("the 1st value is "+a+"2nd value is "+b+"after addtion"+(a+b));
      }
    }
class Subtraction extends Arithmatic{
  void calculate(){
        System.out.println("the 1st value is "+a+"2nd value is "+b+"after addtion"+(a-b));
      }
}
class Multplication extends Arithmatic{
  void calculate(){
        System.out.println("the 1st value is "+a+"2nd value is "+b+"after addtion"+(a*b));
      }
}
public class Calcupoly{
  public static void main(String[]args){
   System.out.println("enter two values");
    a=sc.nextInt();
    b=sc.nextInt();
    Arithmatic d=new Arithmatic();
    Addtion ad=new Addtion();
    Subtraction sb=new Subtraction();
    Multplication mu=new Multplication();
    d.calculate();
    mu.calculate();
    sb.calculate();
    ad.calculate();
  }
}
  
