//47. Write a JAVAprogram to check whether a number is Strong number or not.
import java.util.*;
public class Strong{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
   int temp=n;
   int sum=0,fact=1,d=0;
   while(n>0){
       d=n%10;
       n/=10;
  for(int i=d;i>=1;i--){
    fact=fact*i;
    sum=sum+fact;
    

}
  }
  if(temp==sum){
    System.out.println("Number is Strong number");
}
else {
  System.out.println("Number is not a Strong number");  
}
}


}