import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;


public class MulClient {
    public static void main(String[] args ) throws Exception {
        URL url =
                new URL("http://localhost:8080/mul?wsdl");

        QName qname = 
            new QName(
                "http://service/" , 
                "MulServiceImplService");

        Service service  = Service.create(url, qname);

        MulService mul = service.getPort(MulService.class);

        int result = mul.Mul(10, 30);

        System.out.println("Multiplication = " + result);

    }
}
