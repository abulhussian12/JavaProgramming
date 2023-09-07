

import java.util.*;

 

class Jobseeker {
  String name;
  long mobileno;
  String email;
  private int securitycode;

 

  Jobseeker() {
    Scanner s = new Scanner(System.in);
    System.out.println("eneter candidate name, Mobile no, email");
    name = s.next();
    mobileno = s.nextLong();
    email = s.next();
  }

 

  void applyForJob() {
    System.out.println("i want job");
  }

 

}

 

class Employeer extends Jobseeker {
  Employeer() {
    System.out.println("i am eployeer constructor");
  }

 

  void checkDeatils() {
    System.out.println("jobseeker name is" + name);
    System.out.println("jobseeker mobile no is" + mobileno);
    System.out.println("jobseeker eamil is" + email);

 

  }

 

  void interviewdate() {
    System.out.println(name + " your inetrview is at 30th July");
  }

 

}

 

class Exampleinheritence {
  public static void main(String p[]) {
    Jobseeker j = new Jobseeker();
    j.applyForJob();
    Employeer e = new Employeer();
    e.checkDeatils();
    //j.checkDetails();
    e.interviewdate();
    e.applyForJob();

    
 /*   [2:54 AM] Srilatha Manam

class SingleInheritance {

  public static void main(String p[]) {

    Jobseeker j1 = new Jobseeker();  // j1 is parent class  object

    Jobseeker j2; // j2 is parent class refernce

    j.applyForJob();

    Employeer e1 = new Employeer();  // e1 is child class obejct

    Employeer e2;  // e2 is child refernce

    e1.checkDeatils();

    j1.checkDetails();

    e1.interviewdate();

    e1.applyForJob();

    //Can we assign child class object to parent class reference?

    j2=e1;  // it is valid

    //    Can we assign parent class object to child class reference?

    e2=j1;  // it is invlid it is type mismatch error

  }

}*/
  }
}