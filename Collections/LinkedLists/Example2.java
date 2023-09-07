import java.util.*;

class Example2

{

    public static void main (String[] args) {


        LinkedList<String> alist =new LinkedList<String>();


        alist.add("Karun");

        alist.add("Kishan");
        alist.add("sardar");
        alist.add("rambabu");

    //  alist.poll();
      //alist.pollFirst();
      //alist.pollLast();
      //alist.set(2,"Abul");
      alist.get(0);
      alist.getFirst();
      alist.getLast();
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