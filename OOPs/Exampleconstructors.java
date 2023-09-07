

/*class A {

  int a, b;

 

  A() // -----> it is not default constructor because it was created by programmer

  // no argument constructor

  {

 

  }

 

  /*

   * another way of using no argument constructor

   * 

   * A()

   * {

   * a=23;

   * }

   * 

   */

 // A(int x) // parameterized constructor with one argument

//  {

   // a = x;

 // }

 

 // A(int v, int m)// parameterized constructor with two arguments

//  {

   // a = v;

   // b = m;

 // }

 

  /*void display() {

    System.out.println(a);

  }

 

}

 

class Exampleconstructor {

  public static void main(String args[]) {

    A a1 = new A(); // A(); calling no argument constructor

    a1.display();

 

    A a2 = new A(89); // A(89) will call parameterized constructor with one argument

    a2.display();

    A a3 = new A(100, 200); // A(100,200) will call parameterized constructor with two argument

    a3.display();

 

  }

}
*/

/*
[2:04 AM] Srilatha Manam

class A {

  int a, b;


  A(int x) // parameterized constructor with one argument

  {

    a = x;

  }

 

  

 

  void display() {

    System.out.println(a);

  }

 

}

 

class Amain {

  public static void main(String args[]) {

    A a1 = new A(); // A(); calling no argument constructor

    a1.display();

 

    A a2 = new A(89); // A(89) will call parameterized constructor with one argument

    a2.display();

    A a3 = new A(100, 200); // A(100,200) will call parameterized constructor with two argument

    a3.display();

 

  }

}




its an invalid example for constructor */

/*
class A {
  int a, b;    // insatnce varaibles  
  A(int a, int b) // a,b local varaibles to construtor
  {      
    this.a = a;  // this keyword points current instance  (current objetc )
    // this.a will become inatance variable and a local variable

    this.b=b;
    // // this.b will become inatance variable and b local variable
  }

 

  void display() {
    System.out.println(a);
     System.out.println(b);
  }

 

}
*/

 

/*class Exampleconstructors{
  public static void main(String args[]) {
       A a3 = new A(100, 200); 
    a3.display();

  }
}
*/
class Employee
{
  String name; 
int Year;
doublre salary;
String address;

 

Employee()
{
    Scanner s=new Scanner(System.in);
    System.out.println("enter employee name");
    name=s.nextLine();
    System.out.println("enter year");
    year=s.nextInt();
    System.out.println("enter employee salary");
    salary=s.nextDouble();
    System.out.println("enter Address");
    address=s.next();
}
  void display() 
    {
        System.out.println(name);
       System.out.println(year);
    System.out.println(salray);
    System.out.println(address);
      }

 

}

 

class Exampleconstructors {
  public static void main(String args[]) {
Scanner s=new Scanner(System.in);
System.out.println("enter number of empolyees");
int n=s.nextInt();
 

Employee e[]=new Employee[n];  // array of objects of type empolyee

for(int i=0;i<4;i++)   
 e[i] =new Employee();  
e[i].display();

 

//

 

}
}