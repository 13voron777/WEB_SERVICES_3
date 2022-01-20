package ex_003_marshalling_unmarshalling.country;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.*;

// Каждое нестатическое, непереходное поле в классе, привязанном к JAXB,
// будет автоматически привязано к XML, если только оно не аннотировано XmlTransient.
@XmlAccessorType(XmlAccessType.FIELD)

@XmlRootElement
public class CountryType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String capital;
    @XmlElement(required = true)
    protected String description;
    @XmlAttribute(name = "countryCode")
    protected String countryCode;

    public String getName() {
        return name;
    }
    public void setName(String value) {
        this.name = value;
    }
    public String getCapital() {
        return capital;
    }
    public void setCapital(String value) {
        this.capital = value;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String value) {
        this.description = value;
    }
    public String getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

}
