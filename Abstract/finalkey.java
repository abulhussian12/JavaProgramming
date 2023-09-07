 final class demo{
   final void calcualte(int n){
     System.out.println("square of the number"+(n*n));
   }
 }
class demo2 extends demo{
  void calculate (int n){
    System.out.println("cube of the number"+(n*n*n));
  }
}
public class finalkey{
  public static void main(String[]args){
    demo d=new demo();
    d.calcualte(2);
    demo2 d2=new demo2();
    d.calcualte(3);
  }
}