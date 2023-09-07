import java.util.Scanner;

class Array{
    
   
 

   void Display()
   {
       Scanner sc=new Scanner(System.in);
        int i=0;
        System.out.println("Enter the array size");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the array elements");
        for (  i=0;i<a.length;i++){
            a[i]=sc.nextInt();
             System.out.println("tha given array is"+a[i]);
            }
       
       
        System.out.println("Enter the elemnt to search");
        int elment=sc.nextInt();
             int  first=0,last=a.length-1,mid=(first+last)/2;
        
        while(first<=last){
        
        
        for( i=0;i<a.length;i++){
        if(a[mid]<elment){
            first=mid+1;
        }
        
        else if(a[mid]==elment){
            System.out.println("Elemnt is found at "+mid);
            break;
        }
        
        else {
            last=mid-1;
        }
        }
        mid=(first+last)/2;
        if(first>last){
            System.out.println("Elmentis not found");
        }
    }
   }
}
    public class Main {
    public static void main(String[]args){
        Array ar=new Array();
     
        ar.Display();
    }
    }
