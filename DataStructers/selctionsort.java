import java.util.*;

class BubMethodMain

  {

    Scanner sc=new Scanner(System.in);

    void readArray(int a[],int n)

    {

      int i;

      for(i=0;i<n;i++)

        {

          a[i]=sc.nextInt();      

        }

    }

    void dispArray(int a[],int n)

    {

      int i

        ;

      for(i=0;i<n;i++)

        {

          System.out.print("\t"+a[i]);

        }

    }

    void bubbleSort(int a[],int n)

    {

      int i,t,j;

      for(i=0;i<n-1;i++)

        {

          for(j=i+1;j<n;j++)

            {

              if(a[i]>a[j])

              {

                t=a[i];

                a[i]=a[j];

                a[j]=t;

              }

            }

        }

    }

  }

class Main

  {

    public static void main(String argsp[])

    {

      int n; 

      Scanner sc=new Scanner(System.in);

      BubMethodMain bm=new BubMethodMain();

      System.out.println("Enter Array Size:");

      n=sc.nextInt();

      int a[]=new int[n];

      System.out.println("Enter Elements to Array:");

      bm.readArray(a,n);

      System.out.println("The Elements Berofe sorting is:");

      bm.dispArray(a,n);

 

      bm.bubbleSort(a,n);


      System.out.println("\nThe Elements After sorting is:");

      bm.dispArray(a,n);

 

      

    }

  }