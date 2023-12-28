package mio;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
 
@WebService
@SOAPBinding(style = Style.RPC)
public class Brasil {
 
    @WebMethod
    /*
     * con @WebParam ya no aparece en el wsdl arg0 
     * con @WebParam aparece: Nombre_de_la_variable_que_aparece_en_wsdl
     */
    public String rio(@WebParam(name = "Nombre_de_la_variable_que_aparece_en_wsdl") String name) {
        return "Hola desde rio";
    }
    
    @WebMethod
    public String san_pablo(String name) {
        return "Hola desde San Pablo";
    }
}