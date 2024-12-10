package udp;

import java.io.*;
import java.net.*;

public class ServerFactorial {
    public static void main(String[] args) throws IOException {
        // Create DatagramSocket object
        DatagramSocket ds = new DatagramSocket(3000);
        System.out.println("Server is listening on port " + ds.getPort());

        // Receive request from client
        byte[] bytes = new byte[256];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
        ds.receive(packet);

        // Extract the number from the packet
        String receivedData = new String(packet.getData(), 0, packet.getLength());
        int number = Integer.parseInt(receivedData);
        System.out.println("Received number from client: " + number);

        // Calculate factorial
        long factorial = calculateFactorial(number);

        // Prepare the response
        InetAddress address = packet.getAddress();
        int port = packet.getPort();
        String response = Long.toString(factorial);
        bytes = response.getBytes();

        // Send response to the client
        packet = new DatagramPacket(bytes, bytes.length, address, port);
        ds.send(packet);

        // Close the connection
        ds.close();
    }

    // Method to calculate factorial
    private static long calculateFactorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
