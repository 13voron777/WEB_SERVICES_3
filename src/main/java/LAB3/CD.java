package LAB3;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CD")
public class CD {
    @XmlElement(name = "TITLE")
    private String title;

    @XmlElement(name = "ARTIST")
    private String artist;

    @XmlElement(name = "COUNTRY")
    private String country;

    @XmlElement(name = "COMPANY")
    private String company;

    @XmlElement(name = "PRICE")
    private String price;

    @XmlElement(name = "YEAR")
    private int year;

    @Override
    public String toString() {
        return "CD{" +
                "\ntitle='" + title + '\'' +
                "\nartist='" + artist + '\'' +
                "\ncountry='" + country + '\'' +
                "\ncompany='" + company + '\'' +
                "\nprice='" + price + '\'' +
                "\nyear=" + year +
                "}\n";
    }
}
