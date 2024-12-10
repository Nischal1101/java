package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStream {
 public static void main(String[] args) throws FileNotFoundException,IOException
 {
     try 
     {
      FileInputStream fis = new FileInputStream("./file/ball.txt"); 
         int i=0;
         while((i=fis.read())!=-1)
         {
             System.out.print((char)(i));
         }
         fis.close();
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