package rmidemo;

import java.rmi.registry.*;

public class Server {

    public static void main(String[] args) {
        try {
            CalcRemote obj = new CalcRemote();
            Registry rgstry = LocateRegistry.createRegistry(9000);
            rgstry.bind("multiply", obj);
            System.out.println("Server ready");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
