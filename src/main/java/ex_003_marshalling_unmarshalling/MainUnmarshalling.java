package ex_003_marshalling_unmarshalling;

import ex_003_marshalling_unmarshalling.country.CountryType;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

/**
 * Created by Asus on 08.12.2017.
 */
public class MainUnmarshalling {

    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(CountryType.class);

        Unmarshaller unmarshaller = context.createUnmarshaller();
        CountryType countryTypes =(CountryType) unmarshaller.unmarshal(
                new File("src/main/resources/out.xml"));

            System.out.println(countryTypes.getName() + " " + countryTypes.getCapital()
                    + " " + countryTypes.getCountryCode() + " " + countryTypes.getDescription());
    }

}
