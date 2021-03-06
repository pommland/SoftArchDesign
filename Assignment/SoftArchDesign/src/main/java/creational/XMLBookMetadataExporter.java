package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class XMLBookMetadataExporter extends BookMetadataExporter{
    @Override
    public BookMetadataFormatter exportBook() throws IOException, ParserConfigurationException {
        return new XMLBookMetadataFormatter();
    }
}
