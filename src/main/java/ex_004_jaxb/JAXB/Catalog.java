package ex_004_jaxb.JAXB;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "catalog")
public class Catalog {

    // Список книг и при помощи аннотации будет сгенерирован элемен book
    @XmlElement(name = "book")
    private List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(books.toArray());
    }
}

