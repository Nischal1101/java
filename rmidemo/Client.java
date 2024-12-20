package rmidemo;

import java.rmi.registry.*;

public class Client {

    public static void main(String[] args) {
        try {
            Registry rstry = LocateRegistry.getRegistry(9000);
            Calc obj = (Calc) rstry.lookup("multiply");
            int value = obj.multiply(6, 5);
            System.out.println(value);
        } catch (Exception e) {
        }

    }

}
