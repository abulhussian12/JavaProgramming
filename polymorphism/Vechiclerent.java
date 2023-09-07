import java .util.Scanner;
class Vechicle{
    Scanner sc=new Scanner (System.in);
    String regstrationno = "car123";
  String fueltype = "petrol";
    double rentalrate = 50.0;
  
    //Vechicle(){
     //this.regstrationno=car123;
    //this.fueltype=petrol;
    
  
   // }
    void displayinfo(){
System.out.println("the regstration no of vechicle"+regstrationno);
      System.out.println("the fueltype of vechicle"+fueltype);
  System.out.println("the rental rate per day of vechicle"+rentalrate);
    }
}
class Car extends Vechicle{
    void displayinfo(){
      super.displayinfo();
       System.out.println("Enter noof doors of a vechicle");
    int noofdoors =sc.nextInt();
        /*System.out.println("the regstration no of vechicle"+regstrationno);
  System.out.println("the fueltype of vechicle"fueltype);
           System.out.println("the rental rate per day of vechicle"+rentalrate); */
 System.out.println("no of doors of the vechicle is :"+noofdoors);
    } 
    
}
class Bike extends Vechicle{
  
     void displayinfo(){
       super.displayinfo();
         System.out.println("enter true or false for vechicle has a carrier");
     boolean hasCarrier =sc.nextBoolean();
         /*System.out.println("the regstration no of vechicle"+regstrationno);
           System.out.println("the fueltype of vechicle"fueltype)+System.out.println("the rental rate per day of vechicle"+rentalrate);*/
             System.out.println("vechile has carrier"+hasCarrier);
     }
}
public class Vechiclerent{
    public static void main (String[]args){
        Vechicle v=new Vechicle();
        v.displayinfo();
        Car c=new Car();
        c.displayinfo();
        Bike b=new Bike();
        b.displayinfo();
        
    }
}