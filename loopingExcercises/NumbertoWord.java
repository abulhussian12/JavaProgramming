
//34. Write a JAVAprogram to enter a number and print it in words.
import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number");
    int n=sc.nextInt();
  int  digit=0;
    String s=" ";
     while(n>0){
     digit=n%10;
      n/=10;
    switch (digit){
        case 0:
        s="zero"+s;
        //System.out.println(s);
        break;
      case 1:
      s="one"+s;
        //System.out.println(s);
        break;
        case 2:
         s="Two"+s;
        //System.out.println(s);
        break;
        case 3:
         s="Three"+s;
       // System.out.println(s);
        break;
        case 4:
         s="Four"+s;
        //System.out.println(s);
        break;
        case 5:
        s="five"+s;
        //System.out.println(s);
        break;
        case 6:
        s="Six"+s;
       // System.out.println(s);
        break;
        case 7:
        s="Seven"+s;
        //System.out.println(s);
        break;
        case 8:
        s="Eight"+s;
        //System.out.println(s);
        break;
        case 9:
        s="Nine"+s;
       
        break;
    }
   
    }
    System.out.println(s);
  }
}