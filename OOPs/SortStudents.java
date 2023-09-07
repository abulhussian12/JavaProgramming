import java.util.*;
class SortNames
{

 

void sortingNames(String name[],int size)
{
for(int i=0;i<size-1;i++)
{
for(int j=i+1;j<size;j++)
{
        int o=name[i].compareTo(name[j]);
    if(o>0)
    {
        String g=name[i];
        name[i]=name[j];
        name[j]=g;
    }

 

}
//Array.sort(name)
}

 

}

 

void sortingNames(int p[],int size)
{
for(int i=0;i<size-1;i++)
{
for(int j=i+1;j<size;j++)
{
    if(p[i]>=p[j])
    {
        int g =p[i]; 
        p[i]=p[j];
        p[j]=g;
    }

 

}
}

 

 

}
}

 

 

class SortStudents
{
public static void main(String a[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter no of students");
int n=s.nextInt();

 

SortNames si=new SortNames();

 

String Sortname[]=new String[n]; // array for storing item names

 

System.out.println("Enter names of student");
for(int p=0;p<n;p++)
Sortname[p]=s.next();  // giving names of items to array

 

int avg[]=new int[n];

 

 

System.out.println("Enter avg of the students");
for(int p=0;p<n;p++)
avg[p]=s.nextInt();  // giving prices of items to array

  char Sortgrades[]=new char[n];
  System.out.println()
 

System.out.println("Before sorting all student names are:");
for(int p=0;p<n;p++)
System.out.println(Sortname[p]);

 

 

si.sortingNames(Sortname,n); // sort all items based on names

 

 

System.out.println("After sorting all Stuednt names are:");
for(int p=0;p<n;p++)
System.out.println(Sortname[p]);

 

 

System.out.println("Before sorting all studen avg are:");
for(int p=0;p<n;p++)
System.out.println(avg[p]);

 

 

si.sortingNames(avg,n); // sort all items based on names

 
System.out.println("After sorting all Student avgs are:");
for(int p=0;p<n;p++)
System.out.println(avg[p]);

 

 

}

 

 

}