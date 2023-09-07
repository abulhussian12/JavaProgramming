import java.util.*;
class Main{
public static void main(String[]args){
    LinkedHashSet<String> lhset=new LinkedHashSet<String>();
    lhset.add("Abul");
    lhset.add("Rambabu");
    lhset.add("Kishan");
    lhset.add("Karun");
    System.out.println(lhset);
    lhset.clear();
  System.out.println("using iterator");
  
  Iterator<String> it=lhset.iterator();
  while(it.hasNext()){
      System.out.println(it.next());
      
   
   System.out.println("by using isempty"+lhset.isEmpty());
  }
}
}