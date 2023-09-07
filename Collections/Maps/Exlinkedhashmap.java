/******************************************************************************

        LinkedHASHMAPS

*******************************************************************************/
import java.util.*;
class Main
{
    public static void main (String[] args) 
    {
        LinkedHashMap<Integer,String> lhmap=new LinkedHashMap<>();

        lhmap.put(101,"Karun");
        lhmap.put(102,"Harika");
        lhmap.put(103,"Rambabu");
        lhmap.put(104,"Kishan");
        lhmap.put(105,"Hussin");

         System.out.println("The Elements in the HashMap is:");
        for(Map.Entry ent:lhmap.entrySet())
        {
            System.out.println("Key:"+ent.getKey() +" Value: "+ent.getValue());
        }
        

        lhmap.remove(101);

        lhmap.replace(103,"Bhuvineswari");
    lhmap.containsKey(100);
        

    System.out.println("After Remove and Replace the value is from HashSet:");    
     Set set=lhmap.entrySet();
     Iterator it=set.iterator();
     while(it.hasNext())
     {
         Map.Entry mentry= (Map.Entry)iterator.next();
         System.out.println("Key  is"+mentry.getKey());
          System.out.println(" value is"+mentry.getValue());
     }
    }
}