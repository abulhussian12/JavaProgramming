//2. Point of Sale System: Create a class called "Product" that represents a product. The class should have properties such as name, price, and quantity, and methods such as getName, getPrice and getQuantity. Create another class called "PointOfSale" that represents a point of sale system. The class should have a list of products, and methods such as addProduct, removeProduct, and getTotalCost.
import java.util.Scanner;
class Product{
  String productname;
  double productprice;
  int quantity;
  void Productdetails(){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the product name");
productname=sc.nextLine();
System.out.println("enter the product price");
    productprice=sc.nextDouble();
    System.out.rintln("enter quantity of product");
    quantity=nextInt();
  }
}
class Pointofsale{
void listofproducts(){
  System.out.println("Enter the noof producs");
  int noofproducts=nextInt();
  int arr[]=new String[noofproducts]
  System.out.println("enter the products names");
  for(int i=0;i<noofproducts;i++);
  arr[i]=nextInt();
 System.out.println(" "+arr[i])
  
  
}
  
}