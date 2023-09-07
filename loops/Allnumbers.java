/*Write a java program to print all natural numbers in reverse (from n to 1). -    using while loop
Write a java program to print all natural numbers in reverse (from n to 1). -    using while loop
Write a java program to print all even numbers and odd numbers  between 1 to 100. - using whileloop
Write a java program to find sum of all natural numbers between 1 to n
Write a java program to find sum of all even numbers and odd numbers between 1 to n.
*/



import java.util.Scanner;

public class Allnumbers {

  public static void main(String args[]) {

System.out.println("1. Printing all number from 1 to n");
System.out.println("2. Printing all number from n to 1");
System.out.println("3. Printing even number and odd numbers from  1 to n");
System.out.println("4. Printing sum of all number  from 1 to n");
System.out.println("5. Printing sum of all even and odd number  from 1 to n");
System.out.println("enter your option in range of 1 to n");
Scanner s=new Scanner(System.in);
System.out.prtinln("enter n value");
int n=s.nextInt();  // 8
do
{
System.out.println("enter your option in range of 1 to 5");
int option=s.nextInt();
  int n;
switch(option)
{
case 1: printNumber(n);// printNumber(8)
    break;
case 2: printNumberReverse( n);
    break;
case 3: printEvenOddNumber(n);
    break;
case 4: printSumOfNumber(n);
    break;
case 5: printSumOfEvenOddNumber(n);
    break;
defalut:
    System.out.println("wrong option");
    break;
}
System.out.println("do you want to continue {y/n}");
char c=s.next().charAt(0);
}
while(c!='n');
}
void printNumber(int h)
{
  int i=1;
  while(i<=n){
    System.out.println(i);
    i++;
  }
}
void printNumberReverse(n)
{
int j=n;
  while(j>=1){
    System.out.println(j);
    j--;
  }
}
void printEvenOddNumber(n)
{
  int a=2,b=1;
  while(a<=n)
  {
   if(a%2==0){
  System.out.println(a);
  a++;
   }
  else if(b<=n){
    System.out.println(b);
      b=b+2;
      }
  }
}
void printSumOfNumber(n)
{
  int c=1,sum=0;
    while(c<=n){
    c++;
      sum=sum+c;
       System.out.println(c);
    }
}
void printSumOfEvenOddNumber(n)
{
int d=2,e=1,f=0,g=0;
  while(d<=n){
    if(d%2==0){
      d++;
      f=f+d;
      System.out.Println(f);
    }
    else if(e<=n){
     e=e+2;
      g=g+e;
    }
    
  }
 
}
}
}