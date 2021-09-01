package UI.util.layer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderAccount {

    String mail;
    String passw;

    public String getMail() {
        return mail;
    }
    public String getPassw() {
        return passw;
    }

    public void reader() throws IOException {
        File file = new File("src/main/resources/accaunt.data.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;

        while ((st = br.readLine()) != null) {
            String key;
            String[] array = st.split("\\ = ");
            key =  array[0];
            if (key.equals("email")){
                mail = array[1];
            }
            if (key.equals("password")){
                passw = array[1];
            }
        }
    }
}
