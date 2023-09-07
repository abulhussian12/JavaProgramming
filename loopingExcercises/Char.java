//7. Write a JAVAprogram to check whether a character is alphabet or not.
import java.util.*;
public class Char{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
   System.out.println("Enter any cahracter");
    char c=sc.next().charAt(0);
    if(c>='a'&& c<='z'){
    System.out.println("given value is character");
    }
    else {
      System.out.println(" is not charcater");
      
    }
    
  }
}