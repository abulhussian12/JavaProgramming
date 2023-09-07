/*Employee Salary Calculator: Create an application that takes an employee's
 salary and calculates their annual salary, tax and net salary.
 Use conditional statements to determine the tax bracket and calculate the tax accordingly */



import java.util.Scanner;

public class Salary{

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
 System.out.println("enter the salary per month");
    int salary =sc.nextInt();
    int total_salary,annual_salary,tax;
    
    annual_salary = salary*12;
   
    if(annual_salary>=1000000)
    {
      tax=(annual_salary%25)*100;
      total_salary=annual_salary-tax;
      System.out.println(total_salary); 
    }
  else  if(annual_salary>=500000)
    {
      tax=(annual_salary%15)*100;
      total_salary=annual_salary-tax;
      System.out.println(total_salary);
    }
    else if (annual_salary>250000) {
      tax=(annual_salary%10)*100;
      total_salary=annual_salary-tax;
      System.out.println(total_salary);
    }
    
  else  {
      tax=0;
      total_salary=annual_salary-tax;
      System.out.println(total_salary);
    }
  }
}

      