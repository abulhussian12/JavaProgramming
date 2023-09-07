/*
ATM Simulator: Create a class called "Account" that represents a bank account. 
The class should have properties such as account number, balance, and account holder name, 
and methods such as deposit, withdraw and check balance. 
Create another class called "ATMSimulator" that represents an ATM machine. 
The class should have a list of accounts, and methods such as addAccount, removeAccount, and
 transact.*/
import java.util.Scanner;
class Account
{
  Scanner s=new Scanner(System.in);
  
  //private int pinno;
  System.out.println("Enter account number");
long accountnumber=s.nextLong();
 System.out.println("Enter account holder name");
String Name =s.nextLine();
System.out.println("Enter account balance");
  double balance =s.nextDouble();
void deposit()
{
  System.out.println("Enter money to deposit ");
  double amount=s.nextDouble();
  System.out.println("Total Balance  after deposit "+balance+amount);
}
void withdraw()
{
  System.out.println("Enter money to withdraw ");
  double withdraw=s.nextDouble();
  double total_balance=balance-withdraw;
System.out.println("Total Balance  after withdraw "+total_balance );
}
void check_balance()
{
  System.out.println("Enter account number");
   System.out.println(balance);
}
}

public class Atmsim{
  public static void main(String[]args){
    Account b=new Account();
     b.deposit();
    b.withdraw();
    b.check_balance();
   /* Scanner t=new Scanner(System.in){
    int n=t.nextInt();
    Account a[]=new Account[n];
   
    for(int i=0;i<n;i++){
       int a[i]=t.nextInt();
      //a[i].listofaccounts();
  
        
      }
    void listofaccounts(){
      System.out.println(" "+a[i]);
    }
  void addaccount(){
    System.out.println("Enter a number to add account");
    int add=t.nextInt();
    for( i=n;i<add;i++){
      a[i+1]=a[i];
    }
    for(int i=0;i<n;i++)
        System.out.println("addtion of account"+a[i]);
    
    
  }
  void deleteaccount(){
     System.out.println("Enter a number to delete account");
    int delete=t.nextInt();
    for( i=delete+1;i<n-1-delete;i++){
          a[i-1]=a[i];  
  }
    for(i=0;i<n-2;i++){
     System.out.println("deleted account "+a[i]); 
    }
  }*/
  }
}