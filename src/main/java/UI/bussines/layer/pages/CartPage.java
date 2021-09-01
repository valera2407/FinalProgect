package UI.bussines.layer.pages;

import UI.BaseTestUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage {

    @FindBy(xpath = "//div[3]/div/div/div[3]/div/div[1]/footer/div/button")
    WebElement order;

    @FindBy(id = "product-buy-button")
    WebElement buy;

    @FindBy(className = "comeback")
    WebElement backToShop;

    public void continueSearch() {
        BaseTestUI.wait.until(ExpectedConditions.elementToBeClickable(backToShop));
        backToShop.click();
    }

    public void addToCart() {
        BaseTestUI.wait.until(ExpectedConditions.elementToBeClickable(buy));
        buy.click();
    }
    public void order(){
        BaseTestUI.wait.until(ExpectedConditions.elementToBeClickable(order));
        order.click();
    }
}
