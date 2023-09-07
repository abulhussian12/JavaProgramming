class Travel{
 void Price(double busprice){
   System.out.println("total cost if u tavel in bus is "+busprice);
 } 
 void Price(long carprice){
   System.out.println("total cost if u tavel in car is "+carprice);
 } 
  void Price(int trainprice){
   System.out.println("total cost if u tavel in train is "+trainprice);
 } 
  
}
class Travelpoly{
  public static void main(String[]args){
    Travel t=Travel();
    t.Price(10000);
    t.Price(250000);
    t.Price(2300);
  }
}