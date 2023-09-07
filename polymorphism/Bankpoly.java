 class BankAccount
{
    private int accountNumber;
    protected double balance;

     BankAccount(int accountNumber)
    {
        this.accountNumber=accountNumber;
        this.balance=0.0;
    }

     void deposit(double amount)
    {
        if(amount>0)
        {
         balance=balance+amount;
         System.out.println("The Deposite Amount"+amount); 
        }
        else
        {
            System.out.println("This is Invalid Amount"); 
        }
    }
 void withdraw(double amount){
    if (amount>0)
    {
      balance=(balance-amount);
      System.out.println ("The withdraw amount is" +amount); 
    }
    else {
      System.out.println("enter valid amount to withdraw");
    }
    
  }

}
 class SavingsAccount extends BankAccount {
   int accountNumber;
   double balance;
  SavingsAccount(int accountNumber){
    this.accountNumber=accountNumber;
        this.balance=0.0;
  }
   void withdraw(double amount){
  double withdrawfee=(amount/1)*100;
    if (amount>0){
      balance=(balance-amount-withdrawfee);
      System.out.println("withdraw amount from savings account"+amount);
    }
    else {
      System.out.println("enter valid amount");
    }
  }
  void calculateinterest(double amount){
    double interestRate=(amount/0.1)*100;
  double finalamount=(amount+interestRate);
    System.out.println("amount after adding  interest "+finalamount);
  }
}
 class CurrentAccount extends BankAccount{
   
 double draftlimit=500.0;
   void withdraw(double amount){
    if(amount>500.0){
      balance=(balance-amount);
      System.out.println("withdraw amount is "+ amount);
    }
    else {
      System.out.println("amount should be more than 500 to withdraw");
    }
    
  } 
}
 public class Bankpoly{
  public static void main(String[]args){
    BankAccount ba=new BankAccount(334);
    SavingsAccount sa=new SavingsAccount();
    CurrentAccount ca=new CurrentAccount();
    ba.withdraw(2000);
    sa.withdraw(2000);
    sa.calculateinterest(3000);
    ca.withdraw(4000);
  }
}