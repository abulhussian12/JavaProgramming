//Create class with name cricket having  over’s, match name, no of players, Use the properties of this class in T20Match class, TestMatch calss and OneDayMatch classe and display details of all matches
import java.util.Scanner;
class Cricket{
  int noofplayers;
  int noofovers;
  String playernames;
  Scanner s=new Scanner(System.in);
}
  class T20match extends Cricket{
  void t20match(){
    System.out.println("enter the noof overs in match");
    noofovers=s.nextInt();
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
  void odimatch(){
    System.out.println("enter the noof overs in Odi match");
    noofovers=s.nextInt();
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
class Testmatch extends Cricket{
  void testmatch(){
    System.out.println("enter the noof overs in test match");
    noofovers=s.nextInt();
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
public class DetailsofMatch{
  public static void main(String[]args){
    T20match t=new T20match();
    Odimatch a=new Odimatch();
    Testmatch b=new Testmatch();
    t.t20match();
    a.odimatch();
    b.testmatch();
  }
}

