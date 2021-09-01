package UI;

import UI.dataprovide.SearchProvider;
import UI.util.layer.Lisen;
import UI.util.layer.ReaderAccount;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Listeners(Lisen.class)
public class AlloUI extends BaseTestUI {

    @BeforeMethod
    public void beforeMethod(){
        webDriver.get("https://allo.ua/ru/");
    }

    @Test
    public void logInLogOut () throws InterruptedException, IOException {
        ReaderAccount read = new ReaderAccount();
        String mail;
        String passw;
        read.reader();
        mail = read.getMail();
        passw = read.getPassw();
        logInOut.loginInAccount(mail, passw);
        TimeUnit.SECONDS.sleep(10);
        logInOut.logOutAccount();
    }

    @Test(dataProvider = "productProvider",
            dataProviderClass = SearchProvider.class)
    public void searchProducts(List<String> products) {
        for (String product : products) {
            search.search(product);
            openProduct.openDefaultProduct();
            cart.addToCart();
            cart.continueSearch();
        }
    }

    @Test
    public void promoted() {
        search.openPromotion();
        openProduct.openPromotionProduct();
        cart.addToCart();
        cart.continueSearch();
    }

    @Test
    public void buyProductWithFilter() {
        search.openTVBlock();
        filter.addFilter();
        openProduct.openDefaultProduct();
        cart.addToCart();
        cart.order();
    }

    @Test
    public void compareSmartphones() {
        search.openS21Series();
        compare.addToCompare2devices();
        compare.compare();
    }
}
