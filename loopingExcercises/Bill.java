/*15. Write a JAVAprogram to input electricity unit charges and calculate total electricity bill according to the given condition:

For first 50 units Rs. 0.50/unit

For next 100 units Rs. 0.75/unit

For next 100 units Rs. 1.20/unit

For unit above 250 Rs. 1.50/unit

An additional surcharge of 20% is added to the bill*/
import java.util.Scanner;
public class Bill{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter units");
   double units =sc.nextDouble();
    double bill=(0.50*50units);
    double bill1=(0.75*100);
    double bill2=(1.20*100);
    double total_bill=0,totalbill1=0;
    if (units<=50){
      System.out.println("total electricity bill is"+bill);
  }
    else if(units>50<=150){
      total_bill=(bill+bill1);
      System.out.println("total electricity bill is"+total_bill);
    }
    else if(units>150<=250){
      totalbill=(bill+bill1+)
      System.out.println("total electricity bill is"+totalbill1);
    }
    else if(units>250){
      totalbill1=(bill+bill1+1.25*units);
      System.out.println("total electricity bill is"+totalbill1);
    }
    
}
}