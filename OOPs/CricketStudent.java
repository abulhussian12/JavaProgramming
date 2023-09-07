//Create class student with name cricket having player name, match name, no of players, Use the properties of this class in T20Match, TestMatch and OneDayMatch classes and display details of all matches
import java.util.Scanner;
class Cricket{
  int noofplayers;
  String playernames;
  Scanner s=new Scanner(System.in);
}
class Match extends Cricket{
 // Match(){
 void t20match(){
     System.out.println("enter number of players for T20 Match");
      noofplayers=s.nextInt();
     String arr[]=new String[noofplayers];
     System.out.println("enter player names");
     for(int i=0;i<noofplayers;i++){
       arr[i]=s.next();
        
     }
   for(int i=0;i<noofplayers;i++)
   System.out.println("noofplayers in t20 match "+noofplayers +"player names "+arr[i]);
     }
  
}

class Odimatch extends Cricket{
   //Odimatch(){
     void odimatch(){
       System.out.println("enter number of players for Odi Match");
      noofplayers=s.nextInt();
     String arr[]=new String[noofplayers];
     System.out.println("enter player names");
     for(int i=0;i<noofplayers;i++){
       arr[i]=s.next();
   
   }
       for(int i=0;i<noofplayers;i++){
   System.out.println("noofplayers in Odi match "+noofplayers +"player names "+arr[i]);
       }
}
}

class Testmatch extends Cricket{
  // Testmatch(){
    void testmatch(){
       System.out.println("enter number of players for Test Match");
      noofplayers=s.nextInt();
     String arr[]=new String[noofplayers];
     System.out.println("enter player names");
     for(int i=0;i<noofplayers;i++){
       arr[i]=s.next();
   
     }
      for(int i=0;i<noofplayers;i++)
       System.out.println("noofplayers in Odi match "+noofplayers +"player names "+arr[i]);
    }
}

public class CricketStudent{
  public static void main(String[]args){
    Match t2=new Match();
    Odimatch a=new Odimatch();
    Testmatch b=new Testmatch();
    t2.t20match();
    a.odimatch();
    b.testmatch();
  }
}
