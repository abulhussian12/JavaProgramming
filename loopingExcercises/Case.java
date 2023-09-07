//10. Write a JAVAprogram to check whether a character is uppercase or lowercase alphabet.
mport java.util.*;
public class Case{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
   System.out.println("Enter any cahracter");
    char c=sc.next().charAt(0);
    if(c>='a'&& c<='z'){
    System.out.println("given value is in Small case");
    }
    else if(c>='A'&& c<='Z') {
      System.out.println(" given value is in Upper case");
      
    }
    
  }
}