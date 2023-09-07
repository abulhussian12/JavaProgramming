import java.util.Scanner;
public class Bank{
  public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the name");
   String s=new String();
    s=sc.nextLine();
     StringBuffer a1=new StringBuffer(s);
    System.out.println("enter the account number");
    String s1=new String();
    s1=sc.nextLine();
     StringBuffer a2=new StringBuffer(s1);
    System.out.println("enter the ifsc code");
    String s2=new String();
    s2=sc.nextLine();
     StringBuffer a3=new StringBuffer(s2);
    
   
    System.out.println("enter the option to replace the data ");
    System.out.println("1.Change the name");
    System.out.println("2.Change the Account number");
    System.out.println("3.Change the IFSC code");
  
    int option=sc.nextInt();
    
    switch(option){
        
      case 1:
         System.out.println("enter the name");
     String name=new String();
     name=sc.next();
        //StringBuffer a=new StringBuffer(name);
        System.out.println(a1.replace(0,s.length(),name));
        break;
        
      case 2:
        System.out.println("enter the account number");
    String accountnumber=new String();
     accountnumber=sc.next();
         //StringBuffer b=new StringBuffer(accountnumber);
        System.out.println(a2.replace(0,s1.length(),accountnumber));
        break;
        
      case 3:
        System.out.println("enter the IFSC code");
    String ifsc=new String();
    ifsc=sc.next();
        //StringBuffer c=new StringBuffer(ifsc);
        System.out.println(a3.replace(0,s2.length(),ifsc));
        break;
        
        default :
          System.out.println("enter a correct option");
    }
        
    }
                      
    
  }
