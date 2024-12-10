package socket;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;
import java.util.*;

public class ServerMsg {
  static int fact(int num)
  {
    if(num==0) return 1;
    return num*fact(num-1);
  }
 public static void main(String[] args) throws IOException{
  //Create a server socket. 
  ServerSocket ss=new ServerSocket(3000);
  //Accept connection from the client  
  Socket cs=ss.accept(); 
  // Open input  stream
  Scanner ins = new Scanner(cs.getInputStream());
  // Open output  stream
  PrintWriter outs=new PrintWriter(cs.getOutputStream(),true);

  //Receive msg from client;
  int num=ins.nextInt();
  //Calculate factorial and send result to client.
  outs.println(fact(num));
  // Close all connections.
    ins.close();
    outs.close();
    cs.close();
    ss.close();

 } 
}
