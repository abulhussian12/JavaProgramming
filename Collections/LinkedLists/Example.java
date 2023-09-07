import java.util.*;

class Main

{

    public static void main (String[] args) {


        LinkedList<String> alist =new LinkedList<String>();


        alist.add("Karun");

        alist.add("Kishan");

        alist.addLast("Rambabu");

        alist.addFirst("sardar");

        alist.remove(1);
        alist.removeLast();
        alist.removeFirst();
        System.out.println(alist);


       for(String str:alist ){
           System.out.println(str);
       }
       System.out.println("the elements in arraylist ");
       Iterator itr=alist.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }
       
    }

}