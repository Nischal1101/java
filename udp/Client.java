package udp;
import java.io.*;
import java.net.*;
public class Client{
  public static void main(String[] args) throws IOException{
    // Create datagramsocket object
    DatagramSocket ds=new DatagramSocket();
    byte[] bytes=new byte[256];
    InetAddress address=InetAddress.getByName("localhost");
    //Send request to server.
    DatagramPacket packet=new DatagramPacket(bytes, bytes.length,address,3000);
    ds.send(packet);
    //Read response from server.
    ds.receive(packet);
    //Display received packet
    String received=new String(packet.getData());
    System.out.println("Server says "+received);
    //close connection.
    ds.close();

  }
}
