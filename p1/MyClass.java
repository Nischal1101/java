package p1;

public class MyClass implements MyInterface {
  @Override
  public void display()
  {
System.out.println("display");
  }
  @Override
  public void show()
  {
    System.out.println("show");
  }
  public static void main(String[] args) {
MyClass m= new MyClass();
m.display();
m.show();
  }

  
}
