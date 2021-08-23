package UI.util.layer;

import java.io.FileReader;
import java.util.Properties;

public class PropertieReader {

    static String email;

    public static String getEmail() {
        return email;
    }

    public static String getPassw() {
        return passw;
    }

    static String passw;

    public static void reader()throws Exception {
        FileReader reader = new FileReader("src/main/resources/account.properties");

        Properties p = new Properties();
        p.load(reader);
        email = p.getProperty("email");
        passw = p.getProperty("password");
    }
}
