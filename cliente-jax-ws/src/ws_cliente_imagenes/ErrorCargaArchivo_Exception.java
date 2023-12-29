
package ws_cliente_imagenes;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ErrorCargaArchivo", targetNamespace = "http://imagenes/")
public class ErrorCargaArchivo_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ErrorCargaArchivo faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ErrorCargaArchivo_Exception(String message, ErrorCargaArchivo faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ErrorCargaArchivo_Exception(String message, ErrorCargaArchivo faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: ws_cliente_imagenes.ErrorCargaArchivo
     */
    public ErrorCargaArchivo getFaultInfo() {
        return faultInfo;
    }

}
