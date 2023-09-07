 import java.util.*;
class Gpay
{
   long mobileno;
    private int pinno;
    static int versionno;
    void billpayment()
    {
      Scanner t=new Scanner(System.in);
        int amount;
        pinno=2344;
        System.out.println("enter bill amount");
        amount=t.nextInt();
        System.out.println("paid bill amount of Rs" +amount+ " "+pinno);
    }
    void softwareupdate()
    {
        versionno=12;
        System.out.println("updating in mobile no"+mobileno);
    }
   static  void notification()
    {
        System.out.println("updated software version"+ versionno);
    }
}

 

public class GpayMain {
    public static void main(String args[]) {

      Gpay user1=new Gpay();
      Gpay user2=new Gpay();
      user1.mobileno=11111111;
       user2.mobileno=22222222;
       user1.billpayment();
       user1.softwareupdate();
       Gpay.notification();
       user2.billpayment();
       user2.softwareupdate();
       Gpay.notification();
    }
}


//example for static and non static

/*class Gpay

{

   int a;

  static int b;

static void  display1()

  {

    System.out.println(a);

    System.out.println(b);

  }

  void display2()

  {

    System.out.println(a);

    System.out.println(b);

  }

}



class Gpay

{

   int a;  // non-static variable

  static int b; // static variable  

static void  display1()  // static method

  {

   // System.out.println(a); it is invalid because we cannot acesses non-static variables

    System.out.println(b);

  }

  void display2()  // non-static method

  {

    System.out.println(a);

    System.out.println(b);

  }

}

 

public class GpayMain {


    }

}

class Gpay
{
   int a;  // non-static variable
  static int b; // static variable  
static void  display1()  // static method
  {
      int temp=100;  // it will becie local variable  it is non-static
   // System.out.println(a); it is invalid because we cannot acesses non-static variables
    System.out.println(b);
  }
  void display2()  // non-static method
  {
    System.out.println(a);
    System.out.println(b);
  }
}
*/