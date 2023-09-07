/******************************************************************************

Scenario: Online Shopping Cart

Imagine you're building an online shopping application in Java. One of the requirements
is to implement a shopping cart using an ArrayList to manage the items that users add to their cart
. Each item in the cart has a name, price, and quantity.

Question:

You're tasked with implementing the shopping cart functionality using an ArrayList. 
Define a class named CartItem to represent an item that can be added to the cart. 
The class should have the following attributes:

itemName: a string representing the name of the item.
itemPrice: a double representing the price of the item.
quantity: an integer representing the quantity of the item in the cart.

Implement a class named ShoppingCart that manages the items using an ArrayList of CartItem objects. 
This class should have the following methods:

void addItem(CartItem item): Adds the given CartItem to the shopping cart. If an item with the same 
name already exists in the cart, update the quantity accordingly.
void removeItem(String itemName): Removes the CartItem with the given name from the cart. 
If the item doesn't exist in the cart, print an error message.
double calculateTotalPrice(): Calculates and returns the total price of all items in the cart.
void displayCart(): Displays the contents of the cart, showing each item's name, price, and quantity.

Implement a simple program that demonstrates the usage of the ShoppingCart class. Create a 
few CartItem objects, add them to the cart, remove some items, and then display the final cart 
contents along with the total price.

*******************************************************************************/
import java.util.*;
class cartItem{
    String Itemname;
    double itemPrice;
    int quantity;
    cartItem(String Itemname,double itemPrice,int quantity)
    {
        this.Itemname=Itemname;
        this.itemPrice=itemPrice;
        this.quantity=quantity;
    }
    public String getItemname()
    {
        return Itemname;
    }
    public double getitemPrice()
    {
        return itemPrice;
    }
    public int getquantity()
    {
        return quantity;
    }
  @Override
  public String toString(){
    return "Itemname["+Itemname+"itemprice"+itemPrice+"quantity"+quantity+"]";
  }
}
class ShoppingCart 
  {
    ArrayList<cartItem> cart;
    ShoppingCart(){
        cart=new ArrayList<cartItem>();
    }
    public void Additem(cartItem item)
    {
        cart.add(item);
    }
      public void Removeitem(cartItem item)
    {
        cart.remove(item);
    }
    void display(){
      for(cartItem ci:cart){
        System.out.println("The items in cart"+ci);
      }
    }
    void calacualte(){
      double Total=0;
      for(cartItem ci:cart){
        Total=Total+(ci.getquantity()*ci.getitemPrice());
        
      }
      System.out.println("total amount is "+Total);
    }
    
}
public class Main{
  public static void main(String[]args){
    cartItem ct=new cartItem("Soap",20.0,3);
   ShoppingCart sc=new ShoppingCart();
   sc.Additem(ct);
   sc.display();
   sc.calacualte();
  }
}