public class Arrays{
  int age;
  String name;
  public Arrays(int age,String name)
  {
    this.age=age;
    this.name=name;
  }

  public static void main(String[] args)
  {
         Arrays a= new Arrays(25,"nischal");
         System.out.println(a.age);
         a.cook();


  }
  public void cook()
  {
    System.out.println("flicki flacka is cooking");
  }
}
