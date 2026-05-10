import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://service/")
public interface SignupService {

    @WebMethod
    public String signup(
            String username,
            String password,
            String email
    );
}