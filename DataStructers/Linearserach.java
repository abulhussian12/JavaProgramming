import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        //int i=0;
        System.out.println("Enter the array size");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the array elements");
        for (int i=0;i<a.length;i++){
             a[i]=sc.nextInt();
        }
      for(int i=0;i<a.length;i++){
        System.out.println("tha given array is"+a[i]);
      }
        System.out.println("Enter the elemnt to search");
        int elment=sc.nextInt();
        
        //int arr={ 10,20,30,40,50};
        for(i=0;i<size;i++){
        if(a[i]==elment){
            System.out.println("elemnt is found");
            break;
        }
        }
        if (i==size){
            System.out.println("elment is not found");
        }
    }
}