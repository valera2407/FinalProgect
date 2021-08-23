package UI.bussines.layer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilterPage {

    @FindBy (xpath = "//*[@id=\"popularinput-checkbox-2251-26085\"]")
    WebElement shampoo;

    @FindBy (xpath = "//*[@id=\"input-checkbox-2247-24195\"]")
    WebElement age;

    public void addFilters(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(shampoo));
        shampoo.click();
        wait.until(ExpectedConditions.elementToBeClickable(age));
        age.click();
    }
}
