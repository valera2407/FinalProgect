package UI.bussines.layer.pages;

import UI.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SortedPage {

    @FindBy (xpath = "//*[@id=\"sort-form\"]/ul/li[2]/label")
    WebElement price;

    @FindBy (xpath = "//*[@id=\"sort-form\"]/ul/li[6]/label")
    WebElement downscale;


    public void sortedFromPrice(){
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(price));
        price.click();
    }

    public void downscaleSorted(){
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(downscale));
        downscale.click();
    }
}
