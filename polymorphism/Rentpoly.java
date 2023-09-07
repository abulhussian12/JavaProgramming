/*Design a system for a vehicle rental company that offers different types of vehicles: Car, 
Motorcycle, and Truck.Each vehicle type has a method calculateRentalCost() that calculates
the rental cost based on factors like rental duration and vehicle type. Implement the class
hierarchy and demonstrate method overriding for the calculateRentalCost() method.*/


import java.util.Scanner;

class Rent{
    Scanner sc=new Scanner(System.in);
double durationtime=1;

}
class CarRent extends Rent{
    void calculaterent(){
        System.out.println("enter duration time in hours");
 durationtime=sc.nextDouble();
      double carrent=(durationtime*100) ;
       System.out.println("rent for car for "+ durationtime+"is "+carrent);
    }
    
}
class Motorcycle extends Rent {
    void calculaterent(){
        System.out.println("enter duration time in hours");
 durationtime=sc.nextDouble();
       double motorrent=(durationtime*65) ;
       System.out.println("rent for car for "+ durationtime+"is "+motorrent);
    }
}
class Truck extends Rent{
    void calculaterent(){
        System.out.println("enter duration time in hours");
 durationtime=sc.nextDouble();
       double truckrent=(durationtime*1000) ;
       System.out.println("rent for car for "+ durationtime+"is "+truckrent);
    }
}

public class Rentpoly
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		Rent r=new Rent();
		CarRent c=new CarRent();
		Motorcycle m=new Motorcycle();
		Truck t=new Truck();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the type of vechicle used 1.car, 2.MotorCycle,3.Truck");
		int a=s.nextInt();
		switch (a){
		    case 1:
		        c.calculaterent();
		        break;
		    
		   case 2:
		       m.calculaterent();
		       break;
		   
		  case 3:
		   t.calculaterent();
		   break;
		  
		}
		
		
	}
}
