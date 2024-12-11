public class MethodOverloading {
  public int multiplyByTwo(int a)
  {
    return a*2;
  }
  public float multiplyByTwo(float a)
  {
    return a*3;
  }
  
  public static void main(String[] args) {
      MethodOverloading mo=new MethodOverloading();  
      int ans=mo.multiplyByTwo(5);
      float ans2=mo.multiplyByTwo(5.0f);
      System.out.println(ans);
      System.out.println(ans2);
  }
  
}
