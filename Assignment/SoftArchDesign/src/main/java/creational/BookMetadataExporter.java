package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.PrintStream;


public abstract class BookMetadataExporter extends BookCollection {

    public void export(PrintStream stream) throws IOException, ParserConfigurationException {
        BookMetadataFormatter formatter = exportBook();

        for(Book book : books){
            formatter.append(book);
        }
        stream.println(formatter.getMetadataString());
    }

    public abstract BookMetadataFormatter exportBook() throws IOException, ParserConfigurationException;
}
