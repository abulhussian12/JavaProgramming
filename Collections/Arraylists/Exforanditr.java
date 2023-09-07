import java.util.*;

class Exforanditr

{

    public static void main (String[] args) {


        ArrayList<String> alist =new ArrayList<String>();


        alist.add("Karun");

        alist.add("Kishan");

        alist.add("Rambabu");

        alist.add("sardar");


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
