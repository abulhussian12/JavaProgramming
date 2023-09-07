//33. Write a JAVAprogram to find frequency of each digit in a given integer.
import java.util.*;

class Frequency{
    public static void main(String []args){
        Scanner  sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        int digit=0;
        int arr[]=new int[10];
        int count=0,i=0;
        while (n>0){
        digit=n%10;
        n/=10;
        arr[digit]++;
        }
        for( i=0;i<arr.length;i++){
            if(arr[i]!=0){
                System.out.println(" value "+i+" Frequency  "+arr[i]);
            }
        }
 }
 
           
}