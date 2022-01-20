package LAB3;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "CATALOG")
public class Catalog {
    @XmlElement(name = "CD")
    private List<CD> cdList = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (CD cd : cdList) {
            res.append("\n" + cd);
        }
        return "Catalog{" +
                "cdList=\n" + res +
                "}";
    }
}
