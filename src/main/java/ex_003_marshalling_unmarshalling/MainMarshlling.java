package ex_003_marshalling_unmarshalling;

import ex_003_marshalling_unmarshalling.country.CountryType;
import ex_003_marshalling_unmarshalling.country.ObjectFactory;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;

/**CountryType
 ObjectFactory
 * Created by Asus on 08.12.2017.
 */
public class MainMarshlling {

    public static void main(String[] args) throws JAXBException {
        ObjectFactory factory = new ObjectFactory();
        CountryType countryType = factory.createCountryType();
        countryType.setName("Germany");
        countryType.setCapital("Berlin");
        countryType.setCountryCode("De");
        countryType.setDescription("Detchland is ... ");

        JAXBContext context = JAXBContext.newInstance(CountryType.class);
        Marshaller marshaller = context.createMarshaller();

        marshaller.marshal(countryType, new File("src/main/resources/out.xml"));
    }
}
