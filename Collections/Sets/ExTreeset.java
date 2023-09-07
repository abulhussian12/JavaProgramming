import java.util.*;
class Main{
public static void main(String[]args){
    TreeSet<String> tset=new TreeSet<String>();
    tset.add("Abul");
    tset.add("Rambabu");
    tset.add("Kishan");
    tset.add("Karun");
    System.out.println(tset);
   // lhset.clear();
  System.out.println("using iterator");
  
  Iterator<String> it=tset.iterator();
  while(it.hasNext()){
      System.out.println(it.next());
      
   
   //System.out.println("by using isempty"+lhset.isEmpty());
  }
}
}