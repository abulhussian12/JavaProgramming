class ThreadA implements Runnable
  {
   public void run()
    {
      for(int i=0;i<5;i++)
        System.out.println("thread A: "+i);
    }
  }
public class Example2{
  public static void main(String[]args){
    ThreadA th=new ThreadA();
    thread ta=new thread(th);
    ta.start();
    for(int i=0;i<5;i++){
      System.out.println("main....i"+i);
    }
  }
}