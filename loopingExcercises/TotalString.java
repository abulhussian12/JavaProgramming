//65. Write a JAVAprogram to find total number of alphabets, digits or special character in a string.
import java.util.*; 
public class TotalString{ 
public static void main(String args[]){ 
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a string");
 String a=sc.next();
 int count=0,digits=0,specialchar=0;
 for(int i=0;i<a.length();i++){
    char c=a.charAt(i);
    if(Character.isLetter(c)){
      count++;  
    }
    else if(Character.isDigit(c)){
        digits++;
    }
    else {
        specialchar++;
    }
    
 }
 System.out.println("number of charcters in given string is "+count);
 System.out.println("number of digits in given string is "+digits);
 System.out.println("number of Special Character in given string is "+count);
}
}
