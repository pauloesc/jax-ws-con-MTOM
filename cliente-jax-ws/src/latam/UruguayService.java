
package latam;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UruguayService", targetNamespace = "http://mio/", wsdlLocation = "http://localhost:8080/servidor/latam/uruguay?wsdl")
public class UruguayService
    extends Service
{

    private final static URL URUGUAYSERVICE_WSDL_LOCATION;
    private final static WebServiceException URUGUAYSERVICE_EXCEPTION;
    private final static QName URUGUAYSERVICE_QNAME = new QName("http://mio/", "UruguayService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/servidor/latam/uruguay?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        URUGUAYSERVICE_WSDL_LOCATION = url;
        URUGUAYSERVICE_EXCEPTION = e;
    }

    public UruguayService() {
        super(__getWsdlLocation(), URUGUAYSERVICE_QNAME);
    }

    public UruguayService(WebServiceFeature... features) {
        super(__getWsdlLocation(), URUGUAYSERVICE_QNAME, features);
    }

    public UruguayService(URL wsdlLocation) {
        super(wsdlLocation, URUGUAYSERVICE_QNAME);
    }

    public UruguayService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, URUGUAYSERVICE_QNAME, features);
    }

    public UruguayService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UruguayService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Uruguay
     */
    @WebEndpoint(name = "UruguayPort")
    public Uruguay getUruguayPort() {
        return super.getPort(new QName("http://mio/", "UruguayPort"), Uruguay.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Uruguay
     */
    @WebEndpoint(name = "UruguayPort")
    public Uruguay getUruguayPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://mio/", "UruguayPort"), Uruguay.class, features);
    }

    private static URL __getWsdlLocation() {
        if (URUGUAYSERVICE_EXCEPTION!= null) {
            throw URUGUAYSERVICE_EXCEPTION;
        }
        return URUGUAYSERVICE_WSDL_LOCATION;
    }

}
