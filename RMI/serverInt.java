import java.rmi.* ;

public interface serverInt extends Remote {
    public double cube(int num) throws RemoteException;
}
