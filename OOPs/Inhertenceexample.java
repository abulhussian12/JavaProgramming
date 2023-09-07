import java.util.*;
class Student
{
    int rollno;
    double average;
    Student()
    {
        Scanner d=new Scanner(System.in);
        System.out.println("enter student rollno and  average");
        rollno=d.nextInt();
        average=d.nextDouble();

    }
    void showaverage()
    {
            System.out.println(rollno+"average is"+average);
    }

}
class BtechClass extends Student
{
    void classAverage()
    {
        System.out.println("class average is 45");
    }
}

 

class Inhertenceexample
{
    public static void main(String a[])
    {
        BtechClass bc1=new BtechClass();
        bc1.showaverage(); // inherited property
        bc1.classAverage();  // own property    

 

        BtechClass bc2=new BtechClass();
        bc2.showaverage(); // inherited property
        bc2.classAverage();  // own property

 

        BtechClass bc3=new BtechClass();
        bc3.showaverage(); // inherited property
        bc3.classAverage();  // own property            
    }

}