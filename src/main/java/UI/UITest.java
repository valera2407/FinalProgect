package UI;

import UI.dataprovide.SearchProvider;
import org.testng.annotations.Test;

import java.util.List;

public class UITest extends BaseTest {

    @Test
    public void addPromotionProductToCart() {
        search.openPromotion();
        openProduct.openPromotionProduct();
        cart.addToCart();
        cart.cleanCart();
    }

    @Test(dataProvider = "productProvider",
            dataProviderClass = SearchProvider.class)
    public void searchProducts(List<String> products) {
        for (String product : products) {
            search.search(product);
            openProduct.openSearchProduct();
            cart.addToCart();
            cart.cleanCart();
        }
    }

    @Test
    public void productWithFilters() {
        search.openMensBlock();
        filters.addFilters();
        openProduct.openProductWithFilter();
        cart.addToCart();
        cart.cleanCart();
    }

    @Test
    public void sorted() {
        search.openHairBlock();
        sorted.sortedFromPrice();
        sorted.downscaleSorted();
        openProduct.openBiggest();
        cart.addToCart();
        cart.cleanCart();
    }

    @Test
    public void buySomething() {
        search.openFaceBlock();
        openProduct.openDefaultProduct();
        cart.addToCart();
        cart.makeOrder();
        cart.openHomePage();
        cart.clean();
    }
}
