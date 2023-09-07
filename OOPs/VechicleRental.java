/*You are tasked with developing a Vehicle Rental System program in Java. The system allows users to rent different types of vehicles such as cars, motorcycles, and bicycles. All vehicles have common attributes like make, model, year of manufacture, and rental rate. Each type of vehicle has specific attributes, such as the number of passengers for cars and the engine capacity for motorcycles.

Your program should implement an inheritance hierarchy to represent the vehicles and their rental rates. The rental rate for each vehicle type is calculated differently. Cars have a base rental rate plus an additional amount per passenger, motorcycles have a flat rental rate, and bicycles have a fixed hourly rate.

Your program should allow the user to input vehicle details such as make, model, year of manufacture, type (car, motorcycle, or bicycle), and the specific attributes based on the type. Additionally, the program should allow the user to input the rental rates for each vehicle type. The program should then generate rental information for each vehicle, showing its make, model, year of manufacture, type, rental rate, and any additional attributes specific to the type.*/
import java.util.Scanner;
class Vechicle{
  String model,make;
  int manufactureyear;
  double rentalrate;
  Scanner sc=new Scanner(System.in);
  Vechicle(String model,String make,int manufactureyear,double rentalrate){
    this.model=model;
    this.make=make;
    this.manufactureyear=manufactureyear;
    this.rentalrate=rentalrate;
  }
}
 
  class Car extends Vechicle{
    Car(String model,String make,int manufactureyear,double rentalrate){
        super(model,make,manufactureyear,rentalrate);
    }
      void Rentalrate(){
      System.out.println("Enter the number passers in the car");
      int passengers=sc.nextInt();
      int perpassenger=20;
  double totalcost=(rentalrate+perpassenger*passengers);
      System.out.println("the total rent of the car is "+totalcost);
    }
  
  }
  class Motorbike extends Vechicle{
    Motorbike(String model,String make,int manufactureyear,double rentalrate){
      super(model,make,manufactureyear,rentalrate);
    }
    void Rentalrate(){
      System.out.println("enter the engine capacity");
      double capacity=sc.nextDouble();
      
      System.out.println(capacity+"the engine capacity of the motoebike");
      double flaterent=(rentalrate+10);
      System.out.println("the total rental rate of vechicle is "+flaterent);
    }
  }
class Bicycle extends Vechicle{
  Bicycle(String model,String make,int manufactureyear,double rentalrate){
      super(model,make,manufactureyear,rentalrate);
    }
    void Rentalrate(){
      //System.out.println("enter the engine capacity");
     // double capacity=sc.nextDouble();
      
      System.out.println("enter hours ");
      double flaterent=(rentalrate+10);
      System.out.println("the total rental rate of vechicle is "+flaterent);
      double hours=sc.nextDouble();
      double totalrent=(rentalrate*hours);
      System.out.println("the total rent for bicycle is"+totalrent);
    }
  
}

public class VechicleRental{
  public static void main(String[]ar){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the vechicle type 1.car/n  2.Motorbike/n 3.Bicycle");
   int a=s.nextInt();
       switch(a){
         case 1:
           Car c=new Car("xuz","stell",1986,45.0);
           c.Rentalrate();
           break;
         case 2:
           Motorbike mb=new Motorbike("abc","iron",2007,32.0);
           mb.Rentalrate();
           break;
         case 3:
           Bicycle b=new Bicycle("hero","iron",2009,9.0);
           b.Rentalrate();
   }
    
  }
}