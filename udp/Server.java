package udp;
import java.io.*;
import java.net.*;

public class Server {
 public static void main(String[] args) throws IOException {
      // Create datagramsocket object
  DatagramSocket ds=new DatagramSocket(3000);
  System.out.println("Server is listening on "+ds.getPort());
  // Receive request from client
  byte[] bytes=new byte[256];
  DatagramPacket packet=new DatagramPacket(bytes,bytes.length);
  ds.receive(packet);

  //Prepare message for client.
  InetAddress address=packet.getAddress();
  int port =packet.getPort();
  String s="Hello client";
  bytes=s.getBytes();

  //send msg to client;
  packet=new DatagramPacket(bytes,bytes.length,address,port);
  ds.send(packet);
  //close connection
  ds.close();

 } 
}
