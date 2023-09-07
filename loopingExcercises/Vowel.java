//8. Write a JAVAprogram to input any alphabet and check whether it is vowel or consonant.
import java.util.*;
public class Vowel{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
   System.out.println("Enter any cahracter");
    char c=sc.next().charAt(0);
    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
    System.out.println("given value is Vowel");
    }
    else {
      System.out.println("given value is Consonat");
      
    }
    
  }
}