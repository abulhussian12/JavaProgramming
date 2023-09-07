/* Temperature Converter: Create an application that takes 
a temperature in Celsius or Fahrenheit as input and converts it
 to the other unit. Use conditional statements to determine whether 
to convert from Celsius to Fahrenheit or vice versa.
*/


import java.util.Scanner;
public class Temp{
  public static void main(String[]args) {
   Scanner s=new Scanner (System.in);
    System.out.println("enter the tempature in c.celsius`");
 double tempc=s.nextFloat();
   System.out.println("enter the tempature in f.farhenhit`");
double tempf=s.nextFloat();
  

      tempc =(tempc  * 9/5) + 32;
    System.out.println(tempc +"the value of temparature in farhrenhit");
     
   
      tempf =(tempf *9/5) -32 ;
    System.out.println(tempf +" the value of temperature in celsius" );
    }
  }

    
    