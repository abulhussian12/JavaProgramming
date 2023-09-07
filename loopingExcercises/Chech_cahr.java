//9. Write a JAVAprogram to input any character and check whether it is alphabet, digit or special character.
import java.util.*;
public class Chech_cahr{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
   System.out.println("Enter any cahracter");
    char c=sc.next().charAt(0);
    if(c>='0'&& c<='9'){
    System.out.println("given value is digit");
    }
    else if((c>='a' && c<='z') ||(c>='A' && c<='Z')) {
      System.out.println("given value is Alphabet");
      
    }
    else
    {
      System.out.println("given value is Special Symbol");
      
    }
    
  }
}