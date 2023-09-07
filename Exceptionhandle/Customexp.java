class NonameException extends Exception{
  public NonameException(String message){
        super(message);
  }
}
class Accountbalance{
  double accountbalance=1000;
  Accountbalance(double amount){
   double accountbalance1=accountbalance+amount;
  }
  public void display(double amount) throws NonameException
  {
    if (amount>accountbalance1){
      throw new NonameException("Nobalance in accountException"+amount);
      
    }
    accountbalance=accountbalance + amount;
    System.out.println("accountbalance");
  }
}
public class Customexp{
  public static void main(String[]args){
    Accountbalance ab=new Accountbalance(2000);
    try{
    ab.display(2000);
    }
    catch(NonameException n){
      System.out.println("Excepetion:Nobalance in accountException"+n.getMessage());
    }
  }
    
} 
  