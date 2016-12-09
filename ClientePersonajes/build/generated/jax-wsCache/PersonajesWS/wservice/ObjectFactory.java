
package wservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wservice package. 
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

    private final static QName _EliminarPersonajeResponse_QNAME = new QName("http://WService/", "EliminarPersonajeResponse");
    private final static QName _ActualizarPersonajes_QNAME = new QName("http://WService/", "ActualizarPersonajes");
    private final static QName _ActualizarPersonajesResponse_QNAME = new QName("http://WService/", "ActualizarPersonajesResponse");
    private final static QName _BuscarPersonajes_QNAME = new QName("http://WService/", "BuscarPersonajes");
    private final static QName _IngresarPersonajes_QNAME = new QName("http://WService/", "IngresarPersonajes");
    private final static QName _BuscarPersonajesResponse_QNAME = new QName("http://WService/", "BuscarPersonajesResponse");
    private final static QName _IngresarPersonajesResponse_QNAME = new QName("http://WService/", "IngresarPersonajesResponse");
    private final static QName _EliminarPersonaje_QNAME = new QName("http://WService/", "EliminarPersonaje");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IngresarPersonajes }
     * 
     */
    public IngresarPersonajes createIngresarPersonajes() {
        return new IngresarPersonajes();
    }

    /**
     * Create an instance of {@link BuscarPersonajesResponse }
     * 
     */
    public BuscarPersonajesResponse createBuscarPersonajesResponse() {
        return new BuscarPersonajesResponse();
    }

    /**
     * Create an instance of {@link IngresarPersonajesResponse }
     * 
     */
    public IngresarPersonajesResponse createIngresarPersonajesResponse() {
        return new IngresarPersonajesResponse();
    }

    /**
     * Create an instance of {@link ActualizarPersonajesResponse }
     * 
     */
    public ActualizarPersonajesResponse createActualizarPersonajesResponse() {
        return new ActualizarPersonajesResponse();
    }

    /**
     * Create an instance of {@link BuscarPersonajes }
     * 
     */
    public BuscarPersonajes createBuscarPersonajes() {
        return new BuscarPersonajes();
    }

    /**
     * Create an instance of {@link ActualizarPersonajes }
     * 
     */
    public ActualizarPersonajes createActualizarPersonajes() {
        return new ActualizarPersonajes();
    }

    /**
     * Create an instance of {@link EliminarPersonajeResponse }
     * 
     */
    public EliminarPersonajeResponse createEliminarPersonajeResponse() {
        return new EliminarPersonajeResponse();
    }

    /**
     * Create an instance of {@link EliminarPersonaje }
     * 
     */
    public EliminarPersonaje createEliminarPersonaje() {
        return new EliminarPersonaje();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarPersonajeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WService/", name = "EliminarPersonajeResponse")
    public JAXBElement<EliminarPersonajeResponse> createEliminarPersonajeResponse(EliminarPersonajeResponse value) {
        return new JAXBElement<EliminarPersonajeResponse>(_EliminarPersonajeResponse_QNAME, EliminarPersonajeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarPersonajes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WService/", name = "ActualizarPersonajes")
    public JAXBElement<ActualizarPersonajes> createActualizarPersonajes(ActualizarPersonajes value) {
        return new JAXBElement<ActualizarPersonajes>(_ActualizarPersonajes_QNAME, ActualizarPersonajes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarPersonajesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WService/", name = "ActualizarPersonajesResponse")
    public JAXBElement<ActualizarPersonajesResponse> createActualizarPersonajesResponse(ActualizarPersonajesResponse value) {
        return new JAXBElement<ActualizarPersonajesResponse>(_ActualizarPersonajesResponse_QNAME, ActualizarPersonajesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPersonajes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WService/", name = "BuscarPersonajes")
    public JAXBElement<BuscarPersonajes> createBuscarPersonajes(BuscarPersonajes value) {
        return new JAXBElement<BuscarPersonajes>(_BuscarPersonajes_QNAME, BuscarPersonajes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarPersonajes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WService/", name = "IngresarPersonajes")
    public JAXBElement<IngresarPersonajes> createIngresarPersonajes(IngresarPersonajes value) {
        return new JAXBElement<IngresarPersonajes>(_IngresarPersonajes_QNAME, IngresarPersonajes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPersonajesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WService/", name = "BuscarPersonajesResponse")
    public JAXBElement<BuscarPersonajesResponse> createBuscarPersonajesResponse(BuscarPersonajesResponse value) {
        return new JAXBElement<BuscarPersonajesResponse>(_BuscarPersonajesResponse_QNAME, BuscarPersonajesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarPersonajesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WService/", name = "IngresarPersonajesResponse")
    public JAXBElement<IngresarPersonajesResponse> createIngresarPersonajesResponse(IngresarPersonajesResponse value) {
        return new JAXBElement<IngresarPersonajesResponse>(_IngresarPersonajesResponse_QNAME, IngresarPersonajesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarPersonaje }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WService/", name = "EliminarPersonaje")
    public JAXBElement<EliminarPersonaje> createEliminarPersonaje(EliminarPersonaje value) {
        return new JAXBElement<EliminarPersonaje>(_EliminarPersonaje_QNAME, EliminarPersonaje.class, null, value);
    }

}
