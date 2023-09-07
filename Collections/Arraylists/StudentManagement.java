import java.util.*;

 

class Student
{
    int sid;
    String sname;
    int age;
    ArrayList<String> courses;

    Student(int sid,String sname,int age)
    {
        this.sid=sid;
        this.sname=sname;
        this.age=age;
        this.courses=new ArrayList<>();
    }

    public int getStudentId()
    {
        return sid;
    }
    public String getName ()
    {
        return sname;
    }
    public int getAge()
    {
        return age;
    }
    public ArrayList<String> getCourses()
    {
         return courses;
    }
    public void entollInCourse(String course)
    {
        courses.add(course);
    }
}
class StudentManagementSystem
{
    ArrayList<Student> students;

    public StudentManagementSystem()
    {
        students=new ArrayList<>();
    }

    public void addStudent(Student student)
    {
       students.add(student);
    }
    void removeStudent(int studentId)
    {
        for(Student stu:students)
        {
           if(stu.sid==studentId)   
           {
               students.remove(stu);
           }
           System.out.println("Removed succsessfully");
          
    }
    }
    void enrollStudentInCourse(int studentId, String course)
    {
        for(Student student:students)
        {
           if(student.getStudentId()==studentId)   
           {
                student.entollInCourse(course);
           }
        }   
    }
    void displayStudentInfo(int studentId)
    {
        for(Student student:students)
        {
           if(student.getStudentId()==studentId)   
           {
               System.out.println("Student Information");
               System.out.println("ID: "+student.getStudentId());
               System.out.println("Name: "+student.getName());
               System.out.println("Age: "+student.getAge());
               System.out.println("Courses: "+student.getCourses());
           }
        }

    }
}
public class StudentManagement 
{
   public static void main(String args[]) 
   {
      StudentManagementSystem sms=new StudentManagementSystem();

      Student stu1=new Student(1,"Karun",12);
      Student stu2=new Student(2,"Raj",19);

      sms.addStudent(stu1);
      sms.addStudent(stu2);
      sms.removeStudent(1);
      sms.enrollStudentInCourse(1,"Maths");
      sms.enrollStudentInCourse(1,"History");
      sms.enrollStudentInCourse(1,"Java");
      sms.enrollStudentInCourse(2,"Python");
      sms.enrollStudentInCourse(2,"Science");

      sms.displayStudentInfo(1);

   }
}