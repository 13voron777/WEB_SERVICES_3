package ex_003_marshalling_unmarshalling.country;

public class ObjectFactory {

    public ObjectFactory() {
    }
    public CountryType createCountryType() {
        return new CountryType();
    }
}
