//42. Write a JAVAprogram to find all prime factors of a number.
import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    boolean temp=true;
  for(int i=1;i<=n;i++){
      if(n%i==0){
          if(i==2){
              System.out.println(i+"is a prime factor");
          }
              else {
                  for(int k=2;k<i-1;i++){
                      if(i%k==0){
                          temp=false;
                      }
                      if(temp!=false){
                          System.out.println(i+" is aprime factor");
                      }
                  }
              }
          }
      }
  }
   
  }
