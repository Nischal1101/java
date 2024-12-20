package rmidemo;
import java.rmi.*;

public interface Calc extends Remote {

    public int multiply(int a, int b) throws RemoteException;

}
