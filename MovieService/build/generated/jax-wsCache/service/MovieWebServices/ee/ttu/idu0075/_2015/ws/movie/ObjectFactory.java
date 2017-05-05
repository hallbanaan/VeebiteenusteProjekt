
package ee.ttu.idu0075._2015.ws.movie;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ee.ttu.idu0075._2015.ws.movie package. 
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

    private final static QName _GetMovieResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/movie", "getMovieResponse");
    private final static QName _AddMovieResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/movie", "addMovieResponse");
    private final static QName _GetStatusResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/movie", "getStatusResponse");
    private final static QName _AddStatusResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/movie", "addStatusResponse");
    private final static QName _GetStatusMovieListResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/movie", "getStatusMovieListResponse");
    private final static QName _AddStatusMovieResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/movie", "addStatusMovieResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ee.ttu.idu0075._2015.ws.movie
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMovieRequest }
     * 
     */
    public GetMovieRequest createGetMovieRequest() {
        return new GetMovieRequest();
    }

    /**
     * Create an instance of {@link MovieType }
     * 
     */
    public MovieType createMovieType() {
        return new MovieType();
    }

    /**
     * Create an instance of {@link AddMovieRequest }
     * 
     */
    public AddMovieRequest createAddMovieRequest() {
        return new AddMovieRequest();
    }

    /**
     * Create an instance of {@link GetMovieListRequest }
     * 
     */
    public GetMovieListRequest createGetMovieListRequest() {
        return new GetMovieListRequest();
    }

    /**
     * Create an instance of {@link GetMovieListResponse }
     * 
     */
    public GetMovieListResponse createGetMovieListResponse() {
        return new GetMovieListResponse();
    }

    /**
     * Create an instance of {@link GetStatusRequest }
     * 
     */
    public GetStatusRequest createGetStatusRequest() {
        return new GetStatusRequest();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link AddStatusRequest }
     * 
     */
    public AddStatusRequest createAddStatusRequest() {
        return new AddStatusRequest();
    }

    /**
     * Create an instance of {@link GetStatusListRequest }
     * 
     */
    public GetStatusListRequest createGetStatusListRequest() {
        return new GetStatusListRequest();
    }

    /**
     * Create an instance of {@link GetStatusListResponse }
     * 
     */
    public GetStatusListResponse createGetStatusListResponse() {
        return new GetStatusListResponse();
    }

    /**
     * Create an instance of {@link GetStatusMovieListRequest }
     * 
     */
    public GetStatusMovieListRequest createGetStatusMovieListRequest() {
        return new GetStatusMovieListRequest();
    }

    /**
     * Create an instance of {@link StatusMovieListType }
     * 
     */
    public StatusMovieListType createStatusMovieListType() {
        return new StatusMovieListType();
    }

    /**
     * Create an instance of {@link AddStatusMovieRequest }
     * 
     */
    public AddStatusMovieRequest createAddStatusMovieRequest() {
        return new AddStatusMovieRequest();
    }

    /**
     * Create an instance of {@link StatusMovieType }
     * 
     */
    public StatusMovieType createStatusMovieType() {
        return new StatusMovieType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovieType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/movie", name = "getMovieResponse")
    public JAXBElement<MovieType> createGetMovieResponse(MovieType value) {
        return new JAXBElement<MovieType>(_GetMovieResponse_QNAME, MovieType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovieType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/movie", name = "addMovieResponse")
    public JAXBElement<MovieType> createAddMovieResponse(MovieType value) {
        return new JAXBElement<MovieType>(_AddMovieResponse_QNAME, MovieType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/movie", name = "getStatusResponse")
    public JAXBElement<StatusType> createGetStatusResponse(StatusType value) {
        return new JAXBElement<StatusType>(_GetStatusResponse_QNAME, StatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/movie", name = "addStatusResponse")
    public JAXBElement<StatusType> createAddStatusResponse(StatusType value) {
        return new JAXBElement<StatusType>(_AddStatusResponse_QNAME, StatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusMovieListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/movie", name = "getStatusMovieListResponse")
    public JAXBElement<StatusMovieListType> createGetStatusMovieListResponse(StatusMovieListType value) {
        return new JAXBElement<StatusMovieListType>(_GetStatusMovieListResponse_QNAME, StatusMovieListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusMovieType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/movie", name = "addStatusMovieResponse")
    public JAXBElement<StatusMovieType> createAddStatusMovieResponse(StatusMovieType value) {
        return new JAXBElement<StatusMovieType>(_AddStatusMovieResponse_QNAME, StatusMovieType.class, null, value);
    }

}
