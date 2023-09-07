import java.util.Scanner;
class Products{
  int total_cost=0,noofProducts,Productprice;
  String Productname;
  void read(){
    Scanner s=new Scanner (System.in);
    System.out.println("enter a no of products ");
    noofProducts =s.nextInt();
   int n[]=new int[noofProducts];
    String arr[]=new String[noofProducts];
   System.out.println("enter a  products name ");
    for(int i=0;i<noofProducts;i++){
       arr[i]=s.next();
   }
     System.out.println("enter a products price");
// double Productprice =s.nextDouble();
   for(int j=0;j<noofProducts;j++){
        n[j]=s.nextInt();
     total_cost=total_cost+n[j];
   }
       System.out.println(total_cost);
   } 
  
   }



public class Shopkeeper
{
	public static void main(String[] args) {
		Products p=new Products();
		p.read();
	}
}
