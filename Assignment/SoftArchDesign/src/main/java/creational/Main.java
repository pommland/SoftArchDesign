package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ParserConfigurationException {
        BookMetadataExporter exportXMLFile = new XMLBookMetadataExporter();
        exportXMLFile.add(TestData.sailboatBook);
        exportXMLFile.add(TestData.GoFBook);
        exportXMLFile.export(System.out);
        System.out.println("\n______________________________________________________________________________________\n");
        BookMetadataExporter exportJSONFile = new JSONBookMetadataExporter();
        exportJSONFile.add(TestData.dragonBook);
        exportJSONFile.add(TestData.dinosaurBook);
        exportJSONFile.export(System.out);
        System.out.println("\n______________________________________________________________________________________\n");
        BookMetadataExporter exportCSVFile = new XMLBookMetadataExporter();
        exportCSVFile.add(TestData.dinosaurBook);
        exportCSVFile.add(TestData.cleanArchBook);
        exportCSVFile.export(System.out);
    }
}
