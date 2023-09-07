/*14. Write a JAVAprogram to input basiJAVAsalary of an employee and calculate its Gross salary according to following:

BasiJAVASalary <= 10000 : HRA = 20%, DA = 80%

BasiJAVASalary <= 20000 : HRA = 25%, DA = 90%

BasiJAVASalary > 20000 : HRA = 30%, DA = 95%*/
import java.util.Scanner;
public class Salary{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Basic salary");
    double Hra=0,Da=0,grosssalary;
   double salary=sc.nextDouble();
    if (salary<=10000){
      Hra =(salary/20)*100;
      Da=(salary/80)*100;
      grosssalary=Hra+Da;
      System.out.println("Total salary is "+grossalary);
  }
    else if (salary<=20000){
      Hra =(salary/25)*100;
      Da=(salary/90)*100;
      grosssalary=Hra+Da;
      System.out.println("Total salary is "+grossalary);
  }
    
    else if (salary>20000){
      Hra =(salary/30)*100;
      Da=(salary/95)*100;
      grosssalary=Hra+Da;
      System.out.println("Total salary is "+grossalary);
    }
    
}
}