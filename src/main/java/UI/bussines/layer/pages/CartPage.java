package UI.bussines.layer.pages;

import UI.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

    @FindBy(xpath = "//div[2]/div/div[1]/div[4]/div[2]/div")
    WebElement closeCart;

    @FindBy(xpath = "//div[2]/div/div[1]/div[4]/div[1]/div")
    WebElement order;

    @FindBy(xpath = "//div[1]/div[1]/div/div/div[2]/div[1]/div/div[3]/div[3]/div[1]")
    WebElement buy;

    @FindBy(className = "header-basket")
    WebElement openCart;

    @FindBy(className = "product__button-remove")
    WebElement remove;

    @FindBy(xpath = "//*[@id=\"checkout-form\"]/div[1]/div[2]/div[2]/label")
    WebElement checkoutForm;

    @FindBy(xpath = "//div[1]/div[1]/header/div/div/a")
    WebElement homePage;

    public void addToCart() {
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(buy));
        buy.click();
    }

    public void makeOrder() {
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(order));
        order.click();
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(checkoutForm));
        checkoutForm.click();
    }

    public void continueSearch() {
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(closeCart));
        closeCart.click();
    }

    public void openYourCart() {
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(openCart));
        openCart.click();
    }

    public void openHomePage() {
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(homePage));
        homePage.click();
    }

    public void cleanCart() {
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(remove));
        remove.click();
        /*while (remove.isDisplayed()){
            BaseTest.wait.until(ExpectedConditions.elementToBeClickable(remove));
            remove.click();
        }*/
    }
}
