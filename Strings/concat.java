
import java.util.Scanner;
public class concat{
  public static void main (String[]args){
  /*Scanner g = new Scanner(System.in);
    System.out.println("Give data for   string");
    String s = new String();
    s = g.nextLine();
   //  1. String Length()  : stringobj.lenth()---> retuns an int 
    System.out.println("the size of string is"+s.length());

 

    // 2. String concatenation

 

    // 2.1 concat ---> add one string at the end of another string
    // syntax: stringobj.concat(stringvarible/stringconstant)
    // concat method returns a string
    System.out.println(s.concat("hai"));
    System.out.println("hai".concat(s));

 

    //2.2 concatenation using + operator
    System.out.println(s+"hai");
    System.out.println("hai"+s);
  }
}*/

Scanner g = new Scanner(System.in);

    System.out.println("Give data for 1st  string");

    String s = new String();

    s = g.nextLine();

  /*  System.out.println("Give data for 2nd  string");

    String s2 = new String();

    s2 = g.nextLine();*/

    // 4. String Comparision (two string values)

 

    // 4.1 compareTo

    // syntax: string1.comapreTo(string2)

    // comapte to methods retuns value as 0// -ve // +ve

    //System.out.println(s1.compareTo(s2));

    //System.out.println(s2.compareTo(s1));

    // 4.1 compareTo
    // syntax: string1.comapreTo(string2)
    // comapte to methods retuns value as 0// -ve // +ve
    // System.out.println(s1.compareTo(s2)); //====>-23
    // System.out.println(s2.compareTo(s1));//====> 23
    // 4.2 == operator // return value as true /false
    //== opeartor always check the address

 

    // strng1==string2
    //System.out.println(s1 == s2); // if s1=hello , s2=hello  --> flase
    // is s1=s && s2=s s1==s2---> flase

 

   // String s3 = "hello";
   // String s4 = "hello";
   // System.out.println(s3 == s4);   //--> true
    //for equals method
    //System.out.println(s1.equals(s2));
    //forequalsigonre case
   // System.out.println(s1.equalsIgnoreCase(s2));
    // 4.5 startsWith()
    //System.out.println(s1.startsWith("q"));
   // System.out.println(s2.startsWith("qw"));
    // 4.6 ensdWith()
 // System.out.println(s1.endsWith("th"));
   //System.out.println(s.indexOf("e"));
    //System.out.println(s.indexOf("et"));

 


    // // indexOf(parameter1,parameter2)
    // parameter1===> pattern 
    // parameter2===> some index no

 

   // System.out.println(s.indexOf("e",7));
    //System.out.println(s.indexOf("et",7)); 
  //System.out.println(s2.endsWith("h"));
  

 /* System.out.println(s.lastIndexOf("e"));

    System.out.println(s.lastIndexOf("et"));

    System.out.println(s.lastIndexOf("e", 7));

    System.out.println(s.lastIndexOf("et", 7));

System.out.println(s.contains("et"));*/
    
    //sub stringmethod getting range of character
/*System.out.println(s.substring(1, 8));

    System.out.println(s.substring(1));

    System.out.println(s.substring(1,2));

    System.out.println(s.substring(-1));*/
    
    //return method replace pattern

 System.out.println(s.replace("the", "xy"));

    System.out.println(s.replace("t", "abceds"));

    System.out.println(s);
    //trim method
    System.out.println(s.trim());
  }
}