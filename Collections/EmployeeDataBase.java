import java.util.*;
import java.util.Scanner;

public class EmployeeDataBase {

  public static void main(String[] args) {
    
    // create ArrayList to store employees
    ArrayList<Employee> employeeList = new ArrayList<Employee>();
    Scanner s = new Scanner(System.in);
    // add some employees to the list
    // adding /insert
    employeeList.add(new Employee(101, "John", 30, 60000));
    // calling employee constructor and this is cerating emplyee object
    employeeList.add(new Employee(102, "Jane", 23, 12000));
    employeeList.add(new Employee(109, "Bob", 40, 40000));
    /// travelling operation
    Iterator it = employeeList.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
      // System.out.println(( this.getId());
    }
    String verify = null;
    // for (Employee e : employeeList)
    // for(datatpe varaible:array) e--> each employee object in array list
    // e.toString();
    System.out.println("enter id to get employee details");
    int sid = s.nextInt();

    for (Employee e : employeeList) {
      if (e.getId() == sid) {
        System.out
            .println("id:" + e.getId() + " Name:" + e.getName() + "Age : " + e.getAge() + " Salary:" + e.getSalary());

        verify = "found";
        break;
      }
    }
    if (verify == null)

      System.out.println("not found");
    String verify2 = null;
    System.out.println("enter id to delete employee details");
    int did = s.nextInt();
    for (Employee e : employeeList) {
      if (e.getId() == did) {

        employeeList.remove(e);
        verify2 = "found";
        break;
      }
    }
    if (verify2 == null)

      System.out.println("not found");
    Iterator itr = employeeList.iterator();
    while (it.hasNext()) {
      System.out.println(itr.next());
      // System.out.println(( this.getId());
    }

  }
}

// Employee class with fields for first name, last name, and ID
class Employee {
  private int id;
  private String name;
  private int age;
  private double salary;

  public Employee(int id, String name, int age, double salary) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public double getSalary() {
    return salary;
  }

  public String toString() {
    return "id:" + id + " Name:" + name + "   Age : " + age + " Salary:" + salary;
  }
}
