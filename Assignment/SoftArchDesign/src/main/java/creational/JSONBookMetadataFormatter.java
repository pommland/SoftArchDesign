package creational;

import org.apache.commons.lang3.StringUtils;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import java.io.IOException;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private JSONObject bookObj;
    private JSONArray bookArray;


    public JSONBookMetadataFormatter() throws IOException {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        bookArray = new JSONArray();
        bookObj = new JSONObject();
        bookObj.put("Books", bookArray);
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        JSONArray authorList = new JSONArray();
        JSONObject newBook = new JSONObject();

        for (String author : b.getAuthors()) {

            authorList.add(author);

        }
        newBook.put(Book.Metadata.ISBN.value,b.getISBN());
        newBook.put(Book.Metadata.AUTHORS.value,authorList);
        newBook.put(Book.Metadata.TITLE.value,b.getTitle());
        newBook.put(Book.Metadata.PUBLISHER.value,b.getPublisher());
        bookArray.add(newBook);

        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit.
        return bookObj.toString();
    }
}
