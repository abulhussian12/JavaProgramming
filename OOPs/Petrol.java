/*
create a class Petroleum have data members with price and quality of  Petroleum liquid. Assume starting  1 liter Petroleum liquid is Rs.20. Extend this class by India with method addGst() will add 30%gst to basic 1 liter Petroleum liquid. Further extend India class by States class have its own method call finalPrice() , this method gives final price of liter Petroleum liquid based on number of liters with following condition. */
import java .util.Scanner;
class Petroleum{
  Scanner sc=new Scanner(System.in);
  double petrolprice =20,fixedprice=0,priceind=0;
  
}
class India extends Petroleum{
  void gst(){
double gst =(petrolprice/30)*100;
double priceind=(gst+petrolprice);
System.out.println("petrolprice is "+priceind);
  }
}
class State extends India{
  void gststate(){
  System.out.println("enter gst of your state");
double stategst=sc.nextDouble();
double fixedprice=(priceind+stategst);
System.out.println(fixedprice);
  }
}
class Finalprice extends State{
  void price(){
  System.out.println("enter how many liters ");
int noofliters=sc.nextInt();
double finalprice=(noofliters*fixedprice);
    System.out.println("the total price is :"+finalprice);
  }
}
public class Petrol{
  public static void main(String[]args){
    Finalprice p=new Finalprice();
   // India i=new India();
   
    p.gst();
    p.gststate();
    p.price();
  }
}