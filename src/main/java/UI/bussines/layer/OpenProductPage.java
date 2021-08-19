package UI.bussines.layer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenProductPage {

    @FindBy (xpath = "//div[1]/div[1]/div/div/div[2]/div[1]/div[1]/div/div[9]/ul/li[2]")
    WebElement product;

    public void openProduct(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(product));
        product.click();
    }
}
