abstract class Absdemo{
  abstract void calculate(int n);
}
 class abs1 extends Absdemo{
  void calculate(int n){
    System.out.println("square of the number is :"+(n*n));
  }
}
 class abs2 extends Absdemo{
  void calculate(int n){
    System.out.println("cube of the number is :"+(n*n*n));
  }
}
 class abs3 extends Absdemo{
  void calculate(int n){
    System.out.println("square root of the number is :");
  }
}
public class Example2{
  public static void main(String[]args){
   // Absdemo a=new Absdemo();
  //  a.calculate();
    abs1 a1=new abs1();
    a1.calculate(6);
    abs2 a2=new abs2();
    a2.calculate(7);
    abs3 a3=new abs3();
    a3.calculate(8);
    
  }
}