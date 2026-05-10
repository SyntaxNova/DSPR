import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://service/")
public interface MulService {

    @WebMethod
    public int Mul(int a , int b );
}