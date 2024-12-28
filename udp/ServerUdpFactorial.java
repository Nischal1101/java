package udp;

import java.io.*;
import java.net.*;

public class ServerUdpFactorial {

    public static int fact(int num) {
        if (num == 0) {
            return 1;
        } else {
            return (num) * fact(num - 1);

        }
    }

    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket(3000)) {
            byte[] receiveBuffer = new byte[256];
            byte[] sendBuffer = new byte[256];

            System.out.println("Server is running and waiting for client...");

            // Receive message from client
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            socket.receive(receivePacket);
            String clientMessage = new String(receivePacket.getData());
            int numm = Integer.parseInt(clientMessage);
            int res = fact(numm);

            System.out.println("Received from client: " + numm);

            // Prepare response
            // String response = "Hello client, this is server. Message received.";
            String respo = Integer.toString(res);

            sendBuffer = respo.getBytes();
            InetAddress clientAddress = receivePacket.getAddress();
            int clientPort = receivePacket.getPort();

            DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, clientAddress, clientPort);
            socket.send(sendPacket);
            System.out.println("Response sent to client.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
