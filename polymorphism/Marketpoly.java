/*Design a class structure for an online marketplace platform with different types of products: Electronics, Clothing, and Books. Each product type has a method calculateShippingCost() that computes the shipping cost based on their dimensions and weight. Implement the class hierarchy and demonstrate method overriding for the calculateShippingCost() method.*/
import java.util.Scanner;
class Product{
  Scanner sc=new Scanner(System.in);
double length,breadth,weight,productcost,area,height;
  
}
class Electronics extends Product{
  void calculateShippingcost(){
  System.out.println("enter length , breadth,height and weight of the product");
    length=sc.nextDouble();
    breadth=sc.nextDouble();
    height=sc.nextDouble();
    weight=sc.nextDouble();
    area =(length*breadth*height);
    double cost=(area*25);
    double cost1=(weight*10);
    productcost=(cost+cost1);
    System.out.println("the shipping cost of the product is "+productcost);

}
}
class Clothes extends Product{
  void calculateShippingcost(){
  System.out.println("enter length , breadth and weight of the product");
    length=sc.nextDouble();
    breadth=sc.nextDouble();
    weight=sc.nextDouble();
    area =(length*breadth);
    double cost=(area*12);
    double cost1=(weight*10);
    productcost=(cost+cost1);
    System.out.println("the shipping cost of the product is "+productcost);

}
}
class Books extends Product{
  void calculateShippingcost(){
  System.out.println("enter length , breadth and weight of the product");
    length=sc.nextDouble();
    breadth=sc.nextDouble();
    weight=sc.nextDouble();
    area =(length*breadth);
    double cost=(area*15);
    double cost1=(weight*17);
    productcost=(cost+cost1);
    System.out.println("the shipping cost of the product is "+productcost);

}
}
public class Marketpoly{
  public static void main(String[]args){
    Product p=new Product();
    Electronics e=new Electronics();
    Clothes c=new Clothes();
    Books b=new Books();
    Scanner s=new Scanner(System.in);
    System.out.println("enter product type 1.Electronics "+'\n'+" 2.clothes "+'\n'+"3.Books");
  int f=s.nextInt();
    switch (f){
      case 1:
        e.calculateShippingcost();
        break;
      case 2:
        c.calculateShippingcost();
        break;
      case 3:
        b.calculateShippingcost();
    }
   }
}


