import java.util.*;
class Order{
    private int OrderId;
    public String CustomerName;
    public String product;
    Order(int OrderId,String CustomerName,String product){
        this.OrderId=OrderId;
        this.CustomerName=CustomerName;
        this.product=product;
    }
        public int getOrderId()
        {
            return OrderId;
        }
        public String getCustomerName()
        {
            return CustomerName;
        }
        public String product()
        {
            return product;
        }
        @Override
      public String toString() {
        return "Order [id=" +OrderId + ", CustomerName=" + CustomerName + ", orderName=" +product + "]";
    }
}
class OrderProcessing{
    Queue<Order> order=new LinkedList<>();
    
    void PlaceOrder(Order order1)
    {
        order.add(order1);
    }
    void ProcessOrder()
    {
        System.out.println("your orders"+order);
    }
}
public class Main{
    public static void main(String[]args){
        Order order1=new Order(123,"abul","Bottle");
        Order order2=new Order(145,"hussian","bag");
        OrderProcessing orderprocessing=new OrderProcessing();
        orderprocessing.PlaceOrder(order1);
         orderprocessing.PlaceOrder(order2);
        orderprocessing.ProcessOrder();
    }
}

