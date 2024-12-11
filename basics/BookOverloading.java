public class BookOverloading {
 public static void main(String[] args) {
  System.out.println(BookOverloading.Sum(5,7));
  System.out.println(Sum(5,7,1));
 } 
 static int Sum(int a,int b)
 {
  return a+b;
 }
 static int Sum(int a,int b,int c)
 {
  return a+b+c;
 }

}
