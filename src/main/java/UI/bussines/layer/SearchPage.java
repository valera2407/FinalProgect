package UI.bussines.layer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

    @FindBy (id = "search-input")
    WebElement searchInput;

    @FindBy (className = "header-top-list__item promoted")
    WebElement promoted;

    @FindBy (xpath = "//div[1]/div[1]/nav/div[4]/ul/li[4]")
    WebElement hair;

    @FindBy (xpath = "//div[1]/div[1]/nav/div[4]/ul/li[7]")
    WebElement forMen;

    @FindBy (xpath = "//div[1]/div[1]/nav/div[4]/ul/li[5]")
    WebElement face;


    public void search(String product, WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(searchInput));
        searchInput.sendKeys(product);
        searchInput.submit();
    }

    public void openPromo(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(promoted));
        promoted.click();
    }

    public void openHairBlock(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(hair));
        hair.click();
    }

    public void openMensBlock(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(forMen));
        forMen.click();
    }

    public void openFaceBlock(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(face));
        face.click();
    }
}
