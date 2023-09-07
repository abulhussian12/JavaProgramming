import java.util.*;

 

class String1 {
  public static void main(String[] args) {
    // Creating String using literal and String class
    // giving static data
    /*
     * String s1="welcome"; // using constant
     * String s2=new String("hai"); // using string class
     * 
     * System.out.println(s1);
     * System.out.println(s2);
     */

 

    // giving dynamic data

 

    // allocating memory
    // to give data for a string we have use next() / nextLine()
    Scanner g = new Scanner(System.in);
   System.out.println("Give data for   string");
    String s = new String();
    s = g.nextLine();
    System.out.println(s);  // displaying entire string

 


    /*String st1=new String("Enter any string");
    st1=g.next();
    System.out.println(st1);*/
    // dispalying individual cahracters from string
  for(int l=0;l<=s.length()-1; l++)   // s.length() will return size of string
    // length opeartor used for an array  arrayname.length
    // length() used for strings  stringobject.length()    
    System.out.println(s.charAt(l));

 


    // displaying all words from a String

 

    // to get words from string we have to use spilt();
    // defalut value for split() is space
           String b[]= s.split(" ");
    for(int i=0;i<b.length;i++)
      System.out.println(b[i]);

    String b1[] = s.split("%");
    for (int i = 0; i < b1.length; i++)
      System.out.println(b1[i]);

  }
}
