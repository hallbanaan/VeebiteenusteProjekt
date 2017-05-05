
package ee.ttu.idu0075._2015.ws.movie;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusMovieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statusMovieType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="movie" type="{http://www.ttu.ee/idu0075/2015/ws/movie}movieType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statusMovieType", propOrder = {
    "movie"
})
public class StatusMovieType {

    @XmlElement(required = true)
    protected MovieType movie;

    /**
     * Gets the value of the movie property.
     * 
     * @return
     *     possible object is
     *     {@link MovieType }
     *     
     */
    public MovieType getMovie() {
        return movie;
    }

    /**
     * Sets the value of the movie property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovieType }
     *     
     */
    public void setMovie(MovieType value) {
        this.movie = value;
    }

}
