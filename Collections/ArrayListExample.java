import java.util.*;

class Student {
  String name;
  String id;
  int totalmarks;
  /*
   * Student(String s,String i,int m) { name=s; id=i; totalmarks=m; }
   */

  void insert() {
    Scanner s = new Scanner(System.in);
    System.out.println("enter details of studet");
    name = s.next();
    id = s.next();
    totalmarks = s.nextInt();

  }

  void Serach(String id) {
    if (this.id == id) {
      System.out.println(this.name + this.id + this.totalmarks);
    } else
      System.out.println("not found");
  }

  public String getName() {
    return name;
  }

  public String getId() {
    return id;
  }

  public int getTotalmarks() {
    return totalmarks;
  }

  public String toString() {
    return (name + " " + id + " " + totalmarks);
  }

}

public class ArrayListExample {
  public static void main(String k[]) {

    ArrayList<Student> ar1 = new ArrayList<Student>();
    Student s = new Student();
    s.insert();
    ar1.add(s);

    ar1.toString();

  }
}
