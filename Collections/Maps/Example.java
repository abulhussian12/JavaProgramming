/******************************************************************************

        HASHMAPS

*******************************************************************************/
import java.util.*;
class Main
{
    public static void main (String[] args) 
    {
        HashMap<Integer,String> hmap=new HashMap<>();

        hmap.put(101,"Karun");
        hmap.put(102,"Harika");
        hmap.put(103,"Rambabu");
        hmap.put(104,"Kishan");
        hmap.put(105,"Hussin");

         System.out.println("The Elements in the HashMap is:");
        for(Map.Entry ent:hmap.entrySet())
        {
            System.out.println("Key:"+ent.getKey() +" Value: "+ent.getValue());
        }

        hmap.remove(101);

        hmap.replace(103,"Bhuvineswari");

    System.out.println("After Remove and Replace the value is from HashSet:");    
      Set set = hmap.entrySet(); 
      Iterator iterator = set.iterator(); 
      while(iterator.hasNext()) 
      { 
         Map.Entry mentry = (Map.Entry)iterator.next(); 
         System.out.print("key is: "+ mentry.getKey() + " & Value is: "); 
         System.out.println(mentry.getValue()); 
      } 

    }
}