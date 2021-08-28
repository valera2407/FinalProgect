package UI.util.layer;

import java.io.FileReader;
import java.util.Properties;

public class PropertieReader {

     String email;
     String passw;

    public String getEmail() {
        return email;
    }
    public  String getPassw() {
        return passw;
    }

    public void reader()throws Exception {
        FileReader reader = new FileReader("src/main/resources/account.properties");

        Properties p = new Properties();
        p.load(reader);
        email = p.getProperty("email");
        passw = p.getProperty("password");
    }
}
