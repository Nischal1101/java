package practice;

import java.io.*;
import java.net.*;

public class Server {
    // Recursive factorial function
    static int fact(int num) {
        if (num == 0) return 1;
        return num * fact(num - 1);
    }

    public static void main(String[] args) throws IOException {
        // Create DatagramSocket object
        DatagramSocket socket = new DatagramSocket(3000);
        System.out.println("Server is listening on port 3000");

        // Receive packet from client
        byte[] bytes = new byte[256];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
        socket.receive(packet);

        // Extract data and calculate factorial
        String received = new String(packet.getData(), 0, packet.getLength()).trim();
        int num = Integer.parseInt(received);
        System.out.println("Received from client: " + num);

        int ans = fact(num);
        String stringAns = Integer.toString(ans);
        bytes = stringAns.getBytes();

        // Send response back to client
        InetAddress clientAddress = packet.getAddress();
        int clientPort = packet.getPort();
        packet = new DatagramPacket(bytes, bytes.length, clientAddress, clientPort);
        socket.send(packet);

        // Close the socket
        socket.close();
    }
}
