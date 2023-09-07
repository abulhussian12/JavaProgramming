import java.util.Scanner;
class PrimeNotException extends Exception{
  public class PrimeNotException (String message){
  super(message);
  }
}
class Prime {
  
void read() throws PrimeNotException
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number");
int n=sc.nextInt();
  boolean temp=true;
  if(n>0){
    for(int i=2;i<n;i++){
      if(n%i==0){
        temp=false;
      }
    }
    if (temp==false){
      throw PrimeNotException ("Given number is not a prime");
    }
    else {
      System.out.println("given number is prime");
    }
  }
} 
}
public class PrimeNot{
  public static void main(string[]args){
    Prime p=new Prime();
    try{
    p.read();
      }
    catch(PrimeNotException n){
      System.out.println("Excepetion:PrimeNotException"+n.getMessage());
      
    }
    
  }
}