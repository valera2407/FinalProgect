package UI.dataprovide;

import UI.util.layer.ReaderForProvider;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.util.List;

public class SearchProvider {

    static List<String> data;
    static ReaderForProvider read;

    @DataProvider(name = "productProvider")

    public static Object[][] dataProviderMethod() throws IOException {
        read = new ReaderForProvider();
        read.reader();
        data = read.getListProducts();
        return new Object[][]{
                {data}
        };
    }
}
