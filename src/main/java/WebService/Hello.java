package WebService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService()
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class Hello {


    @WebMethod()
    public String sayHello(String name) {
        return "Hello" + name + ".";
    }

}