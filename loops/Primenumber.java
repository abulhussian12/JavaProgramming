//Create an application that generates a specified number of prime numbers in the given range

import java.util.Scanner;
public class Primenumber{

  public static void main(String[]args){

    Scanner p =new Scanner(System.in);
    System.out.println("enter the starting value");
    int n1=p.nextInt();
     System.out.println("enter the ending value");
    int n2=p.nextInt();
    int i;
   Boolean temp=true;
    if(n1>0){
      for(i=n1;i<=n2;i++)
        {
          if(i%n2==0){
            temp=false;
          }
             if(temp!=false)
            {
System.out.println(i +"prime numbers in given range");
          }
          }
      
        }
    }
    }
  

