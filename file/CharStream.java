package file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStream {
  public static void main(String[] args) throws FileNotFoundException,IOException
 {
     try 
     {
      String hello="hello world\n nischal";
      FileReader fr = new FileReader("./file/ball.txt"); 
      FileWriter fw = new FileWriter("./file/mall.txt"); 
         int i=0;
         while((i=fr.read())!=-1)
         {
             System.out.print((char)(i));
         }
         fw.write(hello);
         fr.close();
         fw.close();
        }
 
        catch (FileNotFoundException e)
          {
            System.out.println(e.getMessage());
          }
        catch(IOException e)
          {

          System.out.println(e.getMessage());
          }
  }
}
