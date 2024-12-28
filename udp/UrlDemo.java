package udp;

import java.net.*;

public class UrlDemo {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://localhost:3000/getData");
        System.out.println("The protocol used is " + url.getProtocol());
        System.out.println("The  Host name is " + url.getHost());
        System.out.println("The  port number is " + url.getPort());
        System.out.println(url.getFile());

    }
}
