import java.util.*;
public class Vectorexample{
    public static void main(String[]args){
    Vector<String> vec=new Vector<String>(2);
    
    //adding elements in vector
    
    vec.addElement("Apple");
    vec.addElement("Abul");
    vec.addElement("Orange");
    vec.addElement("Birds");
    
    //finding size of vector and capacity
    
    System.out.println("The vector size is"+vec.size());
    System.out.println("The vector capacity is"+vec.capacity());
    
      //adding elements in vector
      
      vec.addElement("fruits1");
    vec.addElement("fruits2");
    vec.addElement("fruits3");
    
    //finding size of vectorand capacity
    
    System.out.println("The vector size is"+vec.size());
    System.out.println("The vector capacity is"+vec.capacity());
    }
}