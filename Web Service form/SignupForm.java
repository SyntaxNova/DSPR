package com.signup;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "SignupWebService")
public class SignupWebService {

    @WebMethod(operationName = "signup")
    public String signup(
            @WebParam(name = "name") String name,
            @WebParam(name = "email") String email,
            @WebParam(name = "password") String password) {

        return "Signup Successful!\n"
                + "Name: " + name
                + "\nEmail: " + email;
    }
}
