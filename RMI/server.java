import java.rmi.* ;
import java.rmi.registry.*;


public class server {
    public static void main(String[] args) {
        try{
            try{
                LocateRegistry.createRegistry(1099);
            } catch (Exception e){
                System.out.println("RMI registry already running...");
            }

            serverImp ServerImp = new serverImp();
            Naming.rebind("Server" , ServerImp);
            System.out.println("Server is ready...");
        } catch(Exception e){
            System.out.println("Exception occured at server: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
