import java.util.*;

class Example

{

    public static void main (String[] args) {


        ArrayList<String> alist =new ArrayList<String>();


        alist.add("Karun");

        alist.add("Kishan");

        alist.add("Rambabu");

        alist.add("sardar");


        System.out.println(alist);


        alist.add(2,"Hari Priya");


        System.out.println(alist);
        alist.remove(3);
         System.out.println(alist);
Collections.sort(alist);
System.out.println(alist);
int len=alist.size();
 System.out.println(len);
    }

}