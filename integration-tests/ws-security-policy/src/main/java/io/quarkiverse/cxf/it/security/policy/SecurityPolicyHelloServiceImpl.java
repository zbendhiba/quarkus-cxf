package io.quarkiverse.cxf.it.security.policy;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import org.apache.cxf.annotations.Policy;

/**
 * A service implementation with a trasport policy set
 */
@WebService(serviceName = "HelloService")
@Policy(placement = Policy.Placement.BINDING, uri = "transport-policy.xml")
public class SecurityPolicyHelloServiceImpl implements HelloService {

    @WebMethod
    @Override
    public String hello(String text) {
        return "Hello " + text + "!";
    }

}