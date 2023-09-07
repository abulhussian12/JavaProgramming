import java.util.*;
class SortItems
{

 

void sortingItems(String name[],int size)
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

 

void sortingItems(int p[],int size)
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

 

 

class Exforpolymorphsim
{
public static void main(String a[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter no of items");
int n=s.nextInt();

 

SortItems si=new SortItems();

 

String itemname[]=new String[n]; // array for storing item names

 

System.out.println("Enter names of the items");
for(int p=0;p<n;p++)
itemname[p]=s.next();  // giving names of items to array

 

int price[]=new int[n];

 

 

System.out.println("Enter prices of the items");
for(int p=0;p<n;p++)
price[p]=s.nextInt();  // giving prices of items to array

 

System.out.println("Before sorting all item names are:");
for(int p=0;p<n;p++)
System.out.println(itemname[p]);

 

 

si.sortingItems(itemname,n); // sort all items based on names

 

 

System.out.println("After sorting all item names are:");
for(int p=0;p<n;p++)
System.out.println(itemname[p]);

 

 

System.out.println("Before sorting all item prices are:");
for(int p=0;p<n;p++)
System.out.println(price[p]);

 

 

si.sortingItems(price,n); // sort all items based on names

 

 

System.out.println("After sorting all item prices are:");
for(int p=0;p<n;p++)
System.out.println(price[p]);

 

 

}

 

 

}

