package UI.util.layer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderForProvider {

    List<String> listProducts;

    public void reader() throws IOException {
        File file = new File("src/main/resources/products.for.search");
        BufferedReader br = new BufferedReader(new FileReader(file));

        listProducts = new ArrayList<>();
        String st;

        while ((st = br.readLine()) != null) {
            String values;
            String[] array = st.split("\\ = ");
            values =  array[1];
            listProducts.add(values);
        }
    }

    public List<String> getListProducts() {
        return listProducts;
    }
}
