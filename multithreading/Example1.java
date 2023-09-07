class ThreadA extends Thread
  {
   public void run()
    {
      for(int i=0;i<5;i++)
        System.out.println("thread A: "+i);
    }
  }
class ThreadB extends Thread
{
  public void run()
  {
     for(int i=0;i<5;i++)
        System.out.println("thread B: "+i);
  }
}
class Sample
{
  public static void main(String args[])
  {
    ThreadA ta=new ThreadA();
    ThreadB tb=new ThreadB();
    ta.start();
    tb.start();
     for(int i=0;i<5;i++)
        System.out.println("Main thread: "+i);
    
    
  }
}