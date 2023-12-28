package mio;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
 
@WebService
@SOAPBinding(style = Style.RPC)
public class Uruguay {
 
    @WebMethod
    public String montevideo(String name) {
        return "Hola desde montevideo";
    }
    
    @WebMethod
    public String canelones(String name) {
        return "Hola desde canelones";
    }
}