package inner;

public class AnonymousInner {
public static void main(String[] args) {
 Parent p=new Parent(){
    @Override
    public void method1()
  {
    System.out.println("i am from anonymous inner class");
  }
 }; 
 p.method1();
}
  
}
abstract class Parent{
  public abstract void method1();
}
