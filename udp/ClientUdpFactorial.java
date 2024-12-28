package udp;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientUdpFactorial {

    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket()) {
            byte[] sendBuffer = new byte[256];
            byte[] receiveBuffer = new byte[256];

            // Send message to server
            String greet = "hello server this is client";
            System.out.println("Enter the number: ");
            Scanner sc = new Scanner(System.in);
            String num = sc.nextLine();
            sendBuffer = num.getBytes();
            InetAddress address = InetAddress.getByName("localhost");
            int port = 3000;
            DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, address, port);
            socket.send(sendPacket);
            System.out.println("Message sent to server.");

            // Receive response from server
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            socket.receive(receivePacket);
            String response = new String(receivePacket.getData());
            System.out.println("Response from server: " + response);
            sc.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
