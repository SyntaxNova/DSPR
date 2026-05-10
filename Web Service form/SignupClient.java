import java.net.URL;
import java.util.Scanner;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class SignupClient {

    public static void main(String[] args)
            throws Exception {

        URL url =
                new URL(
                        "http://localhost:8080/signup?wsdl"
                );

        QName qname =
                new QName(
                        "http://service/",
                        "SignupServiceImplService"
                );

        Service service =
                Service.create(url, qname);

        SignupService signup =
                service.getPort(SignupService.class);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        String result =
                signup.signup(
                        username,
                        password,
                        email
                );

        System.out.println(result);

        sc.close();
    }
}