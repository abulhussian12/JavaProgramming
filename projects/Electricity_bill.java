/* Electricity bill app along with GST: create an application that takes 
previous units and present units, and find number of units, 
based on numbers of units find the electricity bill along with GST. 
use conditional statements to determine the unit slabs.*/  
import java.util.Scanner;

public class Electricity_bill{

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
 System.out.println("enter the previous units ");
    double previous_units=sc.nextDouble();
  System.out.println("enter the present units ");
    double present_units=sc.nextDouble();
    double number_of_units,electricity_bill,gst,total_bill;
    number_of_units=(present_units-previous_units);
    electricity_bill =number_of_units*7.92;
    if(electricity_bill>=5000){
      gst=(electricity_bill/20)*100;
      total_bill=(electricity_bill+gst);
      System.out.println(total_bill);
    }
    else if(electricity_bill>=3000){
      gst=(electricity_bill/10)*100;
      total_bill=(electricity_bill+gst);
      System.out.println(total_bill);
    }
    else if(electricity_bill>=1000){
      gst=(electricity_bill/5)*100;
      total_bill=(electricity_bill+gst);
      System.out.println(total_bill);
    }
    else {
      gst=0;
      total_bill=(electricity_bill+gst);
      System.out.println(total_bill);
    }
    }
}
    
   