abstract class Atm{
  abstract void insertcard();
  abstract void pinno();
  abstract void withdraw();
  abstract void checkingbalance();
}
class Abc extends Atm{
  void insertcard(){
    System.out.println("card number is validate");
  }
  void pinno(){
    System.out.println("pinno is validated");
    
  }
  void withdraw(){
    System.out.println("withdrawing amount");
    
  }
  void checkingbalance(){
    System.out.println("cahecking the balance");
  }
  public class Example1{
    publc static void main(String[]args){
     Abc a=new Abc();
      
    }
  }
}