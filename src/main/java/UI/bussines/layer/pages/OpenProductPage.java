package UI.bussines.layer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenProductPage {

    @FindBy (xpath = "//div[1]/div[1]/div/div/div[2]/div[1]/div[1]/div/div[5]/ul/li[1]")
    WebElement promotion;

    @FindBy (xpath = "//div[1]/div[1]/div/div/div[2]/div[1]/div[1]/div/div[9]/ul/li[2]")
    WebElement product;

    @FindBy (xpath = "//div[1]/div[1]/div/div/div[2]/div[1]/div[1]/div/div[8]/ul/li[1]")
    WebElement withFilters;
    ///html/body/div[1]/div[1]/div/div/div[2]/div[1]/div[1]/div/div[8]/ul/li[1]
    ////div[1]/div[1]/div/div/div[2]/div[1]/div[1]/div/div[9]/ul/li[2] staroe
    ///html/body/div[1]/div[1]/div/div/div[2]/div[1]/div[1]/div/div[5]/ul/li[1]

    public void openPromotionProduct(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(promotion));
        promotion.click();
    }

    public void openProductWithFilter(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(withFilters));
        withFilters.click();
    }

    public void openDefaultProduct(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(product));
        product.click();
    }
}
