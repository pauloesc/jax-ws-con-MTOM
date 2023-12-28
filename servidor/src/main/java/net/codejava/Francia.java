package net.codejava;
 
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
 
@WebService
@SOAPBinding(style = Style.RPC)
public class Francia {
 
    @WebMethod
    public String paris(String name) {
        return "Hola desde paris";
    }
}