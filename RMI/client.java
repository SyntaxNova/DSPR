import java.rmi.* ;
import java.util.* ;


public class client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String ServerURL = "rmi://localhost/Server";
            serverInt serverInt = (serverInt) Naming.lookup(ServerURL);

            System.out.print("Enter a num: ");
            int s = sc.nextInt();

            System.out.println("Num is " + s);
            System.out.println("Cube: " + serverInt.cube(s));
        } catch (Exception e) {
            System.out.println("Exception Occured At Client: " + e.getMessage());
            e.printStackTrace();
        } finally{
            sc.close();
        }
    }
    
}
