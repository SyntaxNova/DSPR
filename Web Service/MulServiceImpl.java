import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService(
    endpointInterface = "MulService",
    targetNamespace = "http://service/"
)
public class MulServiceImpl implements MulService {
    
    public int Mul(int a , int b ){
        return a*b ;
    }

    public static void main(String[] args) {

        Endpoint.publish(
            "http://localhost:8080/mul", 
            new MulServiceImpl());
            
        System.out.println("Web Service Started...");
    }
}
