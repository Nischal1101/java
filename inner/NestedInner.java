package inner;

public class NestedInner {
  class Child{
    public void innerMethod()
    {
      System.out.println("i am inner method");
    }
  }
  public void getInnerMethod()
  {
  Child c=new Child(); 
  c.innerMethod();
  }
  public static void main(String[] args) {
NestedInner ni=    new NestedInner();
ni.getInnerMethod();
  }
}
