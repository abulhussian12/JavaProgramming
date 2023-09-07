//Example for HASHSET 
import java.util.*;
class Example{
public static void main(String[]args){
    HashSet<String> hset=new HashSet<String>();
    hset.add("Abul");
    hset.add("Rambabu");
    hset.add("Kishan");
    hset.add("Karun");
    System.out.println(hset);
    
  System.out.println("using iterator");
  
  Iterator<String> it=hset.iterator();
  while(it.hasNext()){
      System.out.println(it.next());
      
  }
}
}