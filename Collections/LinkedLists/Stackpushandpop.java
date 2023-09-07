import java.util.*; 
public class Stackpushandpop{ 
public static void main(String args[]){ 
Stack<String> stack = new Stack<String>(); 

stack.push("Abul"); 

stack.push("ravi"); 
stack.push("Amit");
 stack.pop();
stack.push("Rambabu"); 
stack.push("karun"); 

Iterator<String> itr=stack.iterator(); 
while(itr.hasNext()){ 
System.out.println(itr.next()); 
} 
} 
}  
