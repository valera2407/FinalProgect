package API.util;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import lombok.Data;

import java.io.IOException;
import java.net.URL;

@Data
public class JsonReader {

    private URL file;
    private String myJson;

    public void read() throws IOException {
        setFile(Resources.getResource("book.json"));
        setMyJson(Resources.toString(file, Charsets.UTF_8));
    }
}
