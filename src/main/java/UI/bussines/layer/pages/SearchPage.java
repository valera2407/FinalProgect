package UI.bussines.layer.pages;

import UI.BaseTestUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class SearchPage {

    @FindBy (id = "search-form__input")
    WebElement searchInput;

    @FindBy (xpath = "//*[@id=\"__layout\"]/div/div[1]/div[1]/div[2]/div/ul/li[4]/a")
    WebElement promoted;

    @FindBy (xpath = "//*[@id=\"__layout\"]/div/div[2]/div[1]/div[2]/div[2]/div[1]/a[1]")
    WebElement promotion;

    @FindBy (xpath = "//*[@id=\"__layout\"]/div/div[1]/div[1]/div[3]/div/div/div[2]/div/ul/li[2]/a")
    WebElement smartphones;

    @FindBy (xpath = "//*[@id=\"__layout\"]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div/div/div/div[2]/div/div[2]/ul/li[4]/a")
    WebElement seriesS21;

    @FindBy (xpath = "//*[@id=\"__layout\"]/div/div[1]/div[1]/div[3]/div/div/div[2]/div/ul/li[3]/a")
    WebElement tvBlock;

    @FindBy (xpath = "//*[@id=\"__layout\"]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div/h2/a")
    WebElement allTV;

    public void search(String product){
        BaseTestUI.wait.until(ExpectedConditions.elementToBeClickable(searchInput));
        searchInput.sendKeys(product);
        searchInput.submit();
    }

    public void openPromotion(){
        BaseTestUI.wait.until(ExpectedConditions.elementToBeClickable(promoted));
        promoted.click();
        BaseTestUI.wait.until(ExpectedConditions.elementToBeClickable(promotion));
        promotion.click();
    }

    public void openS21Series(){
        BaseTestUI.wait.until(ExpectedConditions.elementToBeClickable(smartphones));
        smartphones.click();
        BaseTestUI.wait.until(ExpectedConditions.elementToBeClickable(seriesS21));
        seriesS21.click();
    }

    public void openTVBlock(){
        BaseTestUI.wait.until(ExpectedConditions.elementToBeClickable(tvBlock));
        tvBlock.click();
        BaseTestUI.wait.until(ExpectedConditions.elementToBeClickable(allTV));
        allTV.click();
    }
}
