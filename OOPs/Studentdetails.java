//Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'

import java.util.Scanner;
class Student{
  long rollnumber;
  long phonenumber;
  String address;
  void details(){
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the roll number");
  rollnumber=s.nextLong();
  System.out.println("Enter the phone number");
  phonenumber=s.nextLong();
  System.out.println("Enter the address");
  address=s.next();
  }

  void display(){
    System.out.println(rollnumber);
    System.out.println(phonenumber);
    System.out.println(address);
}
}
public class Studentdetails{
  public static void main(String[]args){
    Student sam=new Student(); 
    Student john=new Student(); 
    sam.details();
    john.details();
    sam.display();
    john.display();
  }
}
