package udp;

import java.io.*;
import java.net.*;

public class ClientFactorial {
    public static void main(String[] args) throws IOException {
        // Create DatagramSocket object
        DatagramSocket ds = new DatagramSocket();

        // Take input number from the user
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number to calculate factorial: ");
        String input = reader.readLine();
        byte[] bytes = input.getBytes();

        // Server address and port
        InetAddress address = InetAddress.getByName("localhost");
        int serverPort = 3000;

        // Send number to the server
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, address, serverPort);
        ds.send(packet);

        // Receive response from the server
        bytes = new byte[256];
        packet = new DatagramPacket(bytes, bytes.length);
        ds.receive(packet);

        // Display the factorial received from the server
        String response = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Factorial received from server: " + response);

        // Close the connection
        ds.close();
    }
}
