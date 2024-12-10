package socket;
import java.io.*;
import java.net.*;
import java.util.*;

public class ClientMsg{
  public static void main(String[] args) throws IOException
  {
    //open client socket connection.
   Socket cs= new Socket("localhost",3000);
    //open input stream to the socket.
    Scanner ins=new Scanner(cs.getInputStream());
    //open output stream to the socket.
    PrintWriter outs=new PrintWriter(cs.getOutputStream(),true);
    // Write to socket stream
    outs.println(6);
    // Read from socket stream
    int fact=ins.nextInt();
    System.out.println("Factorial from server is "+fact); 
    // Close all connections.
    ins.close();
    outs.close();
    cs.close();
  }
}

