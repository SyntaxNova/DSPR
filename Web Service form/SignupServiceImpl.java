import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService(
    endpointInterface = "SignupService",
    targetNamespace = "http://service/"
)

public class SignupServiceImpl
        implements SignupService {

    public String signup(
            String username,
            String password,
            String email
    ) {

        return "User Registered Successfully";
    }

    public static void main(String[] args) {

        Endpoint.publish(
                "http://localhost:8080/signup",
                new SignupServiceImpl());

        System.out.println(
                "Signup Web Service Started...");
    }
}