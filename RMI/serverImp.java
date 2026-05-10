import java.rmi.*;
import java.rmi.server.* ;

public class serverImp extends UnicastRemoteObject implements serverInt {
    
    public serverImp() throws RemoteException{
        super();
    }

    public double cube(int num) throws RemoteException {
        return Math.pow(num, 3);
    }
}
