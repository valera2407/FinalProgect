package UI.bussines.layer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SortedPage {

    @FindBy(xpath = "//*[@id=\"sort-form\"]/ul/li[1]/label")
    WebElement name;

    @FindBy (xpath = "//*[@id=\"sort-form\"]/ul/li[2]/label")
    WebElement price;

    @FindBy (xpath = "//*[@id=\"sort-form\"]/ul/li[3]/label")
    WebElement rating;

    @FindBy (xpath = "//*[@id=\"sort-form\"]/ul/li[4]/label")
    WebElement date;

    @FindBy (xpath = "//*[@id=\"sort-form\"]/ul/li[5]/label")
    WebElement upscale;

    @FindBy (xpath = "//*[@id=\"sort-form\"]/ul/li[6]/label")
    WebElement downscale;

    public void sortedFromName(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.invisibilityOfAllElements(name));
        name.click();
    }

    public void sortedFromPrice(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(price));
        price.click();
    }

    public void sortedFromRating(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(rating));
        rating.click();
    }

    public void sortedFromDate(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(date));
        date.click();
    }

    public void upscaleSorted(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(upscale));
        upscale.click();
    }

    public void downscaleSorted(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(downscale));
        downscale.click();
    }
}
