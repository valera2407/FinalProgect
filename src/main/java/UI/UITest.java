package UI;

import org.testng.annotations.Test;

public class UITest extends BaseTest{

    @Test
    public void addPromotionProductToCart(){
        search.openPromotion(webDriver);
        openProduct.openPromotionProduct(webDriver);
        cart.addToCart(webDriver);
    }

    @Test
    public void test2(){

    }

    @Test
    public void test3(){

    }

    @Test
    public void test4(){

    }

    @Test
    public void test5(){

    }
}
