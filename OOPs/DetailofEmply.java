/*You are tasked with developing an Employee Management System program in Java. The program will allow the user to input data for five employees and then display their details. Each employee is represented as an Employee object with attributes such as employeeId, employeeName, department, email, salary, and address.

Here are the requirements for the program:

Each Employee object should have the following attributes:
employeeId (a unique 5-digit number)
employeeName (2 to 30 letters long)
department
email
salary (a positive non-zero value)
address (between 5 and 100 characters)
The program should validate the input for each attribute according to the following rules:
employeeId should be unique and consist of exactly 5 digits.
employeeName should contain only letters and be between 2 and 30 characters long.
salary should be a positive non-zero value.
address should be between 5 and 100 characters long.
The program should prompt the user to input data for each employee. For each employee, the user should provide:
Employee ID (5-digit)
Employee Name
Department
Email
Salary
Address
After collecting the data for five employees, the program should display the details of all the employees, including their employeeId, employeeName, department, email, salary, and address.
Implement appropriate methods for input validation and data display.*/

import java.util.Scanner;
class Employee
{
    String eid;
    String ename;
    String department;
    String email;
    double salary;
    String address;

    public Employee(String eid,String ename,String department,String email,double salary,String address)
    {
        this.eid=eid;
        this.ename=ename;
        this.department=department;
        this.email=email;
        this.salary=salary;
        this.address=address;
    }

    public void displayEmployee()
    {
        System.out.println("The Employee Id:"+eid);
        System.out.println("The Employee Name:"+ename);
        System.out.println("The Employee Department:"+department);
        System.out.println("The Employee Salary:"+salary);
        System.out.println("The Employee Email:"+email);
        System.out.println("The Employee Address:"+address);
    }
}

 

class DetailofEmply
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);

        Employee emp[]=new Employee[2];
        int count=0;

    for(int i=0;i<emp.length;i++)
    {
    System.out.println("Enter Employee Id :"+(i+1));    
    String eid=sc.next();
      String ename;
    System.out.println("Enter Employee Name :"+(i+1));    do{
     ename=sc.next();
    System.out.println("Enter Employee Department :"+(i+1)); 
    }while(!validatename(ename));
      
    String department=sc.next();
    System.out.println("Enter Employee Email :"+(i+1));    
    String email=sc.next();
    double salary;
      String address;
    do
    {
    System.out.println("Enter Employee Salary :"+(i+1));    
     salary=sc.nextDouble();
    }while(!validateSalary(salary));
do{
    System.out.println("Enter Employee Address :"+(i+1));  
      
 address=sc.next();
}while(!validateaddress(address)); 

    emp[i]=new Employee(eid,ename,department,email,salary,address);
    }    

    System.out.println("\n Employee Details:");
    for(Employee emps:emp)
    {
        emps.displayEmployee();
    }

    }
    static boolean validateSalary(double salary)
    {
        return salary>0;
    }
  static boolean validateaddress(String address)
  {
    if (address.length()>5 && address.length()<100){
      return true;
    }
    else {
      System.out.println("address should be in range of 5 to 100 caharcters");
      return false;
    }
  }
  static boolean validatename(String ename){
    if (ename.length()>2 && ename.length()<30){
  return true;
  }
else {
  System.out.println("The name contains between 2 to 30 letters");
  return false;
}
}
  
}