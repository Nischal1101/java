package rmidemo;

import java.rmi.*;
import java.rmi.server.*;

public class CalcRemote extends UnicastRemoteObject implements Calc {

    public CalcRemote() throws RemoteException {
        super();
    }

    public int multiply(int a, int b) {
        return (a * b);
    }
}
