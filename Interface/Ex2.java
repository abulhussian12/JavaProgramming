interface  A{
    public void read();
}
class C {
    int n=5;
}
class  B extends C implements A {
    public void read (){
    int  fact=1;
    //this.n=n;
    if (n>0){
         int k=1;
      while(k<=n){
        fact=fact*k;
        k=k+1;
        }
        System.out.println("factorial of given number is "+fact);
    }
    }
}

public class Ex2{
    public static void main(String[]args){
        B b=new B();
        b.read();
        
    }
}