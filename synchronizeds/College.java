package synchronizeds;

public class College {
  public synchronized void classRoom()
  {
    for(int i=0;i<5;i++)
    {
    System.out.println("This classroom is currently occupied by "+Thread.currentThread().getName());
    try {
      Thread.sleep(1000);
    } catch (Exception e) {
    } 
  }
  }
 public static void main(String[] args) {
  College c=  new College(); 
  Thread ram=new Thread("ram sir"){
    @Override
    public void run()
    {
      c.classRoom();
    }
  };
   Thread shyam=new Thread("SHYAM sir"){
    @Override
    public void run()
    {
      c.classRoom();
    }
  };
  
  ram.start();
  shyam.start();
 } 
}
