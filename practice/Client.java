package practice;

import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
    public static void main(String[] args) throws IOException {
        // Create DatagramSocket object
        DatagramSocket socket = new DatagramSocket();
        Scanner ins = new Scanner(System.in);

        // Input from the user
        System.out.println("Enter a number:");
        String input = ins.nextLine();
        byte[] bytes = input.getBytes();

        // Server address and port
        InetAddress address = InetAddress.getByName("localhost");
        int port = 3000;

        // Send packet to server
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, address, port);
        socket.send(packet);

        // Receive response from server
        bytes = new byte[256];
        packet = new DatagramPacket(bytes, bytes.length);
        socket.receive(packet);

        // Convert and display the response
        String received = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Received from server: " + received);

        // Close resources
        ins.close();
        socket.close();
    }
}
