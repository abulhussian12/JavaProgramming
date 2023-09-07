import java.util.*;

class Student {
  int rollno;
  double average;

  Student() {
    Scanner d = new Scanner(System.in);
    System.out.println("enter student rollno and  average");
    rollno = d.nextInt();
    average = d.nextDouble();

  }

  void showaverage() {
    System.out.println(rollno + "average is" + average);
  }

}

class BtechClass extends Student {
  static void classAverage(double avg) {

    System.out.println("class average is" + avg);
  }
}

class Inhertenceexusingstatic {
  public static void main(String a[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number of student in  a class class ");
      int n=sc.nextInt();
      BtechClass bc[]=new BtechClass[n];
      for(int i=0;i<=n;i++)
       bc[i]=new BtechClass();
        
      
        for(int i=0;i<n;i++)
        bc[i].showaverage(); // inherited property

        
double caverage=0;

for(int i=0;i<n;i++){
        caverage=average+bc[i].average;
}
        BtechClass.classAverage(caverage);
      // here we used class name becuase classAverage is static member and we are acessing out side of class BtechClass 

    }

}