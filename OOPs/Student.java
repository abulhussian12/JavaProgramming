//import java.util.Scanner;
class Marks{
 int subject1;
  int subject2;
  int subject3;
  int avg;
 Marks(int subject1,int subject2,int subject3){
  this.subject1=subject1;
    this.subject2=subject2;
   this.subject3=subject3;
   
 }

void  average(){
avg=(subject1+subject2+subject3)/3;
 System.out.println(avg);
}
  
void display_avg(){
  //System.out.println(avg);
  this.average();
}
}
public class Student{
  public  static void main(String []args){
    Marks subjects=new Marks(70,80,60);
        //subjects.average();
      subjects.display_avg();
    }
  }
