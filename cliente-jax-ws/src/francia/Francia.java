
package francia;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Francia", targetNamespace = "http://codejava.net/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface Francia {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://codejava.net/Francia/parisRequest", output = "http://codejava.net/Francia/parisResponse")
    public String paris(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

}
