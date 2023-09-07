import java.util.*;
class User{
   
   Queue<Integer> tk=new LinkedList<Integer>();
   
  
   void enqueue(int users){
        tk.offer(users);
        System.out.println("adding new tickets"+tk);
    }
  void dequeue(){
       
       System.out.println("remove the tickets"+tk.remove());
   }
    void Peek(){
     System.out.println("First ticket in the queue"+tk.peek());
    }
    void empty(){
        System.out.println("Checking queue is empty or not"+tk.isEmpty());
    }
    void Size(){
        System.out.println("Size of the queue is"+tk.size());
    }
}
public class Main{
    public static void main(String[]args){
        User u=new User();
        u.enqueue(10);
        u.dequeue();
        u.Peek();
        u.empty();
        u.Size();
    }
}