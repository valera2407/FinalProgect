package UI.bussines.layer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

    @FindBy (xpath = "//div[2]/div/div[1]/div[4]/div[2]/div")
    WebElement closeCart;

    @FindBy (xpath = "//div[2]/div/div[1]/div[4]/div[1]/div")
    WebElement order;

    @FindBy (xpath = "//div[1]/div[1]/div/div/div[2]/div[1]/div/div[3]/div[3]/div[1]")
    WebElement buy;

    @FindBy (className = "header-basket")
    WebElement openCart;

    @FindBy (className = "product__button-remove")
    WebElement remove;

    public void addToCart(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(buy));
        buy.click();
    }

    public void makeOrder(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(order));
        order.click();
    }

    public void continueSearch(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(closeCart));
        closeCart.click();
    }

    public void openYourCart(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(openCart));
        openCart.click();
    }

    public void cleanCart(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        while (remove.isEnabled()){
            wait.until(ExpectedConditions.elementToBeClickable(remove));
            remove.click();
        }
    }
}
