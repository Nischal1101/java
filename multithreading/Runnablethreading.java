package multithreading;

public class Runnablethreading implements Runnable{
  @Override 
  public void run()
  {
    print();
  }
  static void print()
  {
     for(int i=0;i<1;i++)
      {
        System.out.println("hello from "+Thread.currentThread().getName());
        try{Thread.sleep(1000);}catch(InterruptedException e){}
      }
  }
 public static void main(String[] args) {
Runnablethreading m= new Runnablethreading(); 
Thread t1=new Thread(m);
Thread t2=new Thread(m);
t2.setName("Nischal");
t1.setName("kafle");
t2.setPriority(3);
t1.setPriority(7);
t1.start();
t2.start();
print();

 } 
}
