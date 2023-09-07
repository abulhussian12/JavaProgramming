
//48. Write a JAVAprogram to print all Strong numbers between 1 to n.

import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
   int temp=n;
   int sum=0,fact=1,d=0;

  for(int i=1;i<=n;i++){
      for(int j=i;j>=1;j--){
    fact=fact*j;
    sum=sum+fact;
      }
       if(temp==sum){
    System.out.println(i+"Number is Strong number");
}
}

 

}


}