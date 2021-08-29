package API;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

import java.io.IOException;
import java.net.URL;

public class JsonReader {

    URL file;
    String myJson;

    public void read() throws IOException {
        file = Resources.getResource("book.json");
        myJson = Resources.toString(file, Charsets.UTF_8);
    }
}
