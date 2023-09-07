//66. Write a JAVAprogram to count total number of vowels and consonants in a string.
import java.util.*; 
public class Main{ 
public static void main(String args[]){ 
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a string");
 String a=sc.next();
 int count=0,digits=0,specialchar=0;
 for(int i=0;i<a.length();i++){
    char c=a.charAt(i);
    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
      count++;  
    }
    else {
        digits++;
    }
    
    
 }
 System.out.println("number of vowels in given string is "+count);
 System.out.println("number of consonents in given string is "+digits);
 //System.out.println("number of Special Character in given string is "+count);
}
}
