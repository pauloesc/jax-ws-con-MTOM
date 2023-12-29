
package ws_cliente_imagenes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws_cliente_imagenes package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DescargarImg_QNAME = new QName("http://imagenes/", "descargarImg");
    private final static QName _DescargarImgResponse_QNAME = new QName("http://imagenes/", "descargarImgResponse");
    private final static QName _ErrorCargaArchivo_QNAME = new QName("http://imagenes/", "ErrorCargaArchivo");
    private final static QName _SubirImg_QNAME = new QName("http://imagenes/", "subirImg");
    private final static QName _SubirImgResponse_QNAME = new QName("http://imagenes/", "subirImgResponse");
    private final static QName _DescargarImgResponseReturn_QNAME = new QName("", "return");
    private final static QName _SubirImgArg1_QNAME = new QName("", "arg1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws_cliente_imagenes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DescargarImg }
     * 
     */
    public DescargarImg createDescargarImg() {
        return new DescargarImg();
    }

    /**
     * Create an instance of {@link DescargarImgResponse }
     * 
     */
    public DescargarImgResponse createDescargarImgResponse() {
        return new DescargarImgResponse();
    }

    /**
     * Create an instance of {@link ErrorCargaArchivo }
     * 
     */
    public ErrorCargaArchivo createErrorCargaArchivo() {
        return new ErrorCargaArchivo();
    }

    /**
     * Create an instance of {@link SubirImg }
     * 
     */
    public SubirImg createSubirImg() {
        return new SubirImg();
    }

    /**
     * Create an instance of {@link SubirImgResponse }
     * 
     */
    public SubirImgResponse createSubirImgResponse() {
        return new SubirImgResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescargarImg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagenes/", name = "descargarImg")
    public JAXBElement<DescargarImg> createDescargarImg(DescargarImg value) {
        return new JAXBElement<DescargarImg>(_DescargarImg_QNAME, DescargarImg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescargarImgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagenes/", name = "descargarImgResponse")
    public JAXBElement<DescargarImgResponse> createDescargarImgResponse(DescargarImgResponse value) {
        return new JAXBElement<DescargarImgResponse>(_DescargarImgResponse_QNAME, DescargarImgResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorCargaArchivo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagenes/", name = "ErrorCargaArchivo")
    public JAXBElement<ErrorCargaArchivo> createErrorCargaArchivo(ErrorCargaArchivo value) {
        return new JAXBElement<ErrorCargaArchivo>(_ErrorCargaArchivo_QNAME, ErrorCargaArchivo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubirImg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagenes/", name = "subirImg")
    public JAXBElement<SubirImg> createSubirImg(SubirImg value) {
        return new JAXBElement<SubirImg>(_SubirImg_QNAME, SubirImg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubirImgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imagenes/", name = "subirImgResponse")
    public JAXBElement<SubirImgResponse> createSubirImgResponse(SubirImgResponse value) {
        return new JAXBElement<SubirImgResponse>(_SubirImgResponse_QNAME, SubirImgResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = DescargarImgResponse.class)
    public JAXBElement<byte[]> createDescargarImgResponseReturn(byte[] value) {
        return new JAXBElement<byte[]>(_DescargarImgResponseReturn_QNAME, byte[].class, DescargarImgResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "arg1", scope = SubirImg.class)
    public JAXBElement<byte[]> createSubirImgArg1(byte[] value) {
        return new JAXBElement<byte[]>(_SubirImgArg1_QNAME, byte[].class, SubirImg.class, ((byte[]) value));
    }

}
